//UIUC CS125 FALL 2014 MP. File: MovieSurvey.java, CS125 Project: Challenge2-Hollywood, Version: 2015-09-14T13:28:26-0500.244411492
/**
 * A program to run a simple survey and report the results. See MovieSurvey.txt
 * for more information. TODO: add your netid to the line below
 * 
 * @author ivanng3
 */
public class MovieSurvey {
	public static void main(String[] arg) {
		System.out.println("Welcome. We're interested in how people are watching movies this year.");
		System.out.println("Thanks for your time. - The WRITERS GUILD OF AMERICA.");
		System.out.println("Please tell us about how you've watched movies in the last month.");
		System.out.println("How many movies have you seen at the cinema?");
		int Cinema;
		Cinema = TextIO.getlnInt();
		System.out.println("How many movies have you seen using a DVD or VHS player?");
		int DVDvhs;
		DVDvhs = TextIO.getlnInt();
		System.out.println("How many movies have you seen using a Computer?");
		int Computer;
		Computer = TextIO.getlnInt();
		System.out.println("Summary: " + Cinema + " Cinema movies, " + DVDvhs + " DVD/VHS movies, " + Computer + " Computer movies");
		int total = 0;
				total = Cinema+DVDvhs+Computer;
		System.out.println("Total: " + total + " movies");
		double percentagecinema;
		percentagecinema = (1.0)*(Cinema)/(total);
		double percentageout;
		percentageout = (1.0)*(DVDvhs+Computer)/total;
		TextIO.putf("Fraction of movies seen at a cinema: " + "%.2f", percentagecinema*100);
		TextIO.put("%");
		System.out.println();
		TextIO.putf("Fraction of movies seen outside of a cinema: " + "%.2f", percentageout*100);
		TextIO.put("%");
	
		// TODO: Write your program here
		// Hints :
		// Formatted output
		// http://math.hws.edu/javanotes/c2/s4.html#basics.4.4
		
		// Don't just copy paste the expected output
		// For grading purposes your code may be tested
		// with other input values.
	}
}
