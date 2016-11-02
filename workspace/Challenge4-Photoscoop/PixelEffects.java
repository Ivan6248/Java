//UIUC CS125 FALL 2014 MP. File: PixelEffects.java, CS125 Project: Challenge4-Photoscoop, Version: 2015-09-28T08:52:38-0500.034623480

/* A class to implement the various pixel effects.
 *
 * Todo: Put your netid (i.e. username) in the line below
 * 
 * @author ivanng3
 */
public class PixelEffects {

	/** Copies the source image to a new 2D integer image */
	public static int[][] copy(int[][] source) {
		// Create a NEW 2D integer array and copy the colors across
		int [][] array = new int [source.length][source[0].length];
		for (int i=0;i<source.length;i++)
			for(int k=0;k<source[0].length;k++)
				array[i][k]=source[i][k];
				
		// See redeye code below
		return array; // Fix Me
	}
	/**
	 * Resize the array image to the new width and height
	 * You are going to need to figure out how to map between a pixel
	 * in the destination image to a pixel in the source image
	 * @param source
	 * @param newWidth
	 * @param newHeight
	 * @return
	 */
	public static int[][] resize(int[][] source, int newWidth, int newHeight) {
		int [][] tgt = new int [newWidth][newHeight];
		int srcW=source.length;
		int srcH=source[0].length;
		
		for (int tgtx=0;tgtx<newWidth;tgtx++){
			for (int tgty=0;tgty<newHeight;tgty++){
				int srcY = (int)(((double)tgty/(double)newHeight)*srcH);
				int srcX = (int)(((double)tgtx/(double)newWidth)*srcW);
				tgt[tgtx][tgty] = source[srcX][srcY];
			}
		}
			
		return tgt; // Fix Me
		// Hints: Use two nested for loops between 0... newWidth-1 and 0.. newHeight-1 inclusive.
		// Hint: You can just use relative proportion to calculate the x (or y coordinate)  in the original image.
		// For example if you're setting a pixel halfway across the image, you should be reading half way across the original image too.
	}

	/**
	 * Half the size of the image. This method should be just one line! Just
	 * delegate the work to resize()!
	 */
	public static int[][] half(int[][] source) {
		return resize(source, source.length/2, source[0].length/2); // Fix Me
	}
	
	/**
	 * Create a new image array that is the same dimesions of the reference
	 * array. The array may be larger or smaller than the source. Hint -
	 * this methods should be just one line - delegate the work to resize()!
	 * 
	 * @param source
	 *            the source image
	 * @param reference
	 * @return the resized image
	 */
	public static int[][] resize(int[][] source, int[][] reference) {
		return resize(source, reference.length, reference[0].length); // Fix Me
	}

	/** Flip the image vertically */
	public static int[][] flip(int[][] source) {
		int [][] flipped = new int [source.length][source[0].length];
		for (int i=0;i<source.length;i++){
			for (int k=0; k<source[0].length; k++){
				flipped[i][source[0].length-k-1]=source[i][k];
			}
		}
		return flipped;// Fix Me
	}

	/** Reverse the image horizontally */
	public static int[][] mirror(int[][] source) {
		int [][] mirrored = new int [source.length][source[0].length];
		for (int i=0; i<source.length; i++){
			for (int k=0; k<source[0].length;k++){
				mirrored[source.length-i-1][k]=source[i][k];
			}
		}
		return mirrored;// Fix Me
	}

	/** Rotate the image */
	public static int[][] rotateLeft(int[][] source) {
		int srcW = source.length;
		int srcH = source[0].length;
		int tgtW = srcH;
		int tgtH = srcW;
		int [][] rotated = new int [tgtW][tgtH];
		for (int i=0; i<tgtW; i++){
			for (int k=0; k<tgtH; k++){
				rotated[i][k]=source[k][i];
			}
		}
		rotated=flip(rotated);
		return rotated;
	}

	/** Merge the red,blue,green components from two images */
	public static int[][] merge(int[][] sourceA, int[][] sourceB) {
		int [][] background = resize(sourceB, sourceA);
		int [][] merged = new int [sourceA.length][sourceA[0].length];
		for (int i=0; i<sourceA.length;i++)
			for (int k=0; k<sourceA[0].length;k++){
				int r = ((RGBUtilities.toRed(sourceA[i][k])) + (RGBUtilities.toRed(background[i][k]))) /2;
				int g = ((RGBUtilities.toGreen(sourceA[i][k])) + (RGBUtilities.toGreen(background[i][k]))) / 2;
				int b = ((RGBUtilities.toBlue(sourceA[i][k])) +  (RGBUtilities.toBlue(background[i][k]))) /2 ;
				merged [i][k] = RGBUtilities.toRGB(r, g, b);
			}
	
		// The output should be the same size as the input. Scale (x,y) values
		// when reading the background
		// (e.g. so the far right pixel of the source is merged with the
		// far-right pixel ofthe background).
		return merged;
	}

	/**
	 * Replace the green areas of the foreground image with parts of the back
	 * image
	 */
	public static int[][] chromaKey(int[][] foreImage, int[][] backImage) {
		int [][] image = resize(foreImage, backImage);
		for (int i=0;i<image.length;i++){
			for (int k=0;k<image[0].length;k++){
				int r = (RGBUtilities.toRed(image[i][k]));
				int g = (RGBUtilities.toGreen(image[i][k]));
				int b = (RGBUtilities.toBlue(image[i][k]));
				if (g > (r+b)){
					image[i][k]=backImage[i][k];
				}
			}
		}
		// If the image has a different size than the background use the
		// resize() method
		// create an image the same as the background size.
		return image;
	}

	/** Removes "redeye" caused by a camera flash. sourceB is not used */
	public static int[][] redeye(int[][] source, int[][] sourceB) {

		int width = source.length, height = source[0].length;
		int[][] result = new int[width][height];
		for (int i = 0; i < width; i++)
			for (int j = 0; j < height; j++) {
				int rgb = source[i][j];
				int red = RGBUtilities.toRed(rgb);
				int green = RGBUtilities.toGreen(rgb);
				int blue = RGBUtilities.toBlue(rgb);
				if (red > 4 * Math.max(green, blue) && red > 64)
					red = green = blue = 0;
				result[i][j] = RGBUtilities.toRGB(red, green, blue);
			}

		return result;
	}

	/* Upto you! do something fun to the image */
	/* Randomly changes each pixel to a different color*/
	public static int[][] funky(int[][] source, int[][] sourceB) {
		int [][] background = resize(sourceB, source);
		int [][] funky = new int [source.length][source[0].length];
			for (int i=0;i<background.length;i++)
				for (int k=0;k<background[0].length;k++){
					int rgb = background[i][k];
					int r = RGBUtilities.toRed(rgb);
					int g = RGBUtilities.toGreen(rgb);
					int b = RGBUtilities.toBlue(rgb);
					r = (int)(Math.random()*255);
					g = (int)(Math.random()*255);
					b = (int)(Math.random()*255);
					funky [i][k] = RGBUtilities.toRGB(r, g, b);
				}
					
		// You need to invent your own image effect
		// Minimum boring requirements to pass autograder:
		
		// Does not ask for any user input and returns a new 2D array
		// Todo: remove this return null
		return funky;
	}
}
