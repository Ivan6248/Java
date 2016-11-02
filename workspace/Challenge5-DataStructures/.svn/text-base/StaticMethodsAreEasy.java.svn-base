//UIUC CS125 FALL 2014 MP. File: StaticMethodsAreEasy.java, CS125 Project: Challenge5-DataStructures, Version: 2015-10-10T21:56:32-0500.761415177
public class StaticMethodsAreEasy {
// Oh no... Someone removed  the methods but left the comments!!
// Hint: Get the Geocache class working and passing its tests first.

	/**
	 * Returns an array of num geocaches. Each geocache is initialized to a random
	 * (x,y) location.
	 * if num is less than zero, just return an empty array of length 0.
	 * 
	 * @param num
	 *            number of geocaches to create
	 * @return array of newly minted Points
	 * 
	 * @author ivanng3
	 */
//write the method here...
	public static Geocache[] createGeocaches(int number){
		Geocache empty[] = new Geocache[0];
		if (number<0){
			return empty;
		}
		else{
			Geocache g[] = new Geocache[number];
			for(int i=0;i<g.length;i++)
				g[i]=new Geocache(Math.random()*1000,Math.random()*1000);
				
		return g;	
		
	}
	}
	
	/**
	 * Modifies geocaches if the geocache's X value is less than the allowable minimum
	 * value.
	 * 
	 * @param p
	 *            array of geocaches
	 * @param minX
	 *            minimum X value.
	 * @return number of modified geocaches (i.e. x values were too small).
	 */
	//write the method here...
		public static void ensureMinimumXValue(Geocache[] p, double minX){
            for (int x=0; x<p.length;x++){
                if (p[x].getX()< minX){
                        p[x].setX(minX);
		}
            }
		}

	/**
	 * Counts the number of geocaches that are equal to the given geocache
	 * Hint: Use geocache.equals() method 
	 * @param p -
	 *            geocache array
	 * @param test -
	 *            test geocache (compared using .equal)
	 * @return number of matching geocaches
	 */
	//write the method here...
		   public static int countEqual(Geocache[] p, Geocache old){
               int count =0;
               for (int i=0;i<p.length; i ++){
                       if (p[i].equals(old)){
                               count++;
                       }
               }
               return count;
}
	}
