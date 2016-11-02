//UIUC CS125 FALL 2014 MP. File: RainGame.java, CS125 Project: PairProgramming, Version: 2015-09-28T22:04:51-0500.417319692
/**
 * @author replace-this-with-your-netids-on-this-line-here-with-a-comma-between-them
 */
public class RainGame {

	public static void main(String[] args) {
		// To get points type your netids above (CORRECTLY-Please double check your partner correctly spells your netid correctly!!)
		// Your netid is the unique part of your @illinois email address
		// Do not put your name or your UIN. 
		// REMEMBER TO COMMIT this file...
	
		
		TextIO.putln("Enter a difficulty: (Easy, Medium, Hard, Impossible)");
		String Difficulty = TextIO.getln();
		
		int x=0, y=0, dx=0, dy=0, score = -1;
	
		String text = "";
		long startTime =System.currentTimeMillis();
		int level=0;
		Zen.setFont("Helvetica-64");
		while (Zen.isRunning()) {

			if (text.length() == 0) {
				if (Difficulty.toUpperCase().equals("EASY")){
				x = 0;
				y = Zen.getZenHeight() / 2;
				dx = 2;
				dy = 0;
				level=1;
			
				}
				else if (Difficulty.toUpperCase().equals("MEDIUM")){
				x = (int)(Math.random()*Zen.getZenWidth());
				y = Zen.getZenHeight() / 2;
				dx = (int)(Math.random()*4);
				dy = 3;
				level=2;
				}
				else if (Difficulty.toUpperCase().equals("HARD")){
				x = 0;
				y = Zen.getZenHeight() / 2;
				dx = 10;
				dy = 10;
				level = 3;
				}
					
					
				text = "" + (int) (Math.random() * 999);
				long elapsed = System.currentTimeMillis() - startTime;
				startTime = System.currentTimeMillis();
				score += 1;
		
			}
			int R=(int)(Math.random()*255);
			int G=(int)(Math.random()*255);
			int B=(int)(Math.random()*255);
			Zen.setColor(R, G, B);
			Zen.fillRect(0, 0, Zen.getZenWidth(), Zen.getZenHeight());

			Zen.setColor(R, G, B);
			Zen.drawText(text, x, y);
			if(x>Zen.getZenWidth()){
				x=(int)(Math.random()*Zen.getZenWidth());
			if(y>Zen.getZenHeight()){
				y=(int)(Math.random()*Zen.getZenHeight());
			}
			}
			Zen.drawText("Level: " + level,0,50);
			Zen.drawText("Score: " + score,0,100);
			
			x += dx;
			y += dy;
			
			// Find out what keys the user has been pressing.
			String user = Zen.getEditText();
			// Reset the keyboard input to an empty string
			// So next iteration we will only get the most recently pressed keys.
			Zen.setEditText("");
			
			for(int i=0;i < user.length();i++) {
				char c = user.charAt(i);
				if(c == text.charAt(0))
					text = text.substring(1,text.length()); // all except first character
			}
			Zen.flipBuffer();
			Zen.sleep(5);// sleep for 90 milliseconds

		}
	}

}
