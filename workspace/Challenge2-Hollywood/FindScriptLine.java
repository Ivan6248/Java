//UIUC CS125 FALL 2014 MP. File: FindScriptLine.java, CS125 Project: Challenge2-Hollywood, Version: 2015-09-14T13:28:26-0500.244411492
/**
 * A program to search for specific lines and print their line number.
 * See FindScriptLine.txt for more details
 * TODO: add your netid to the line below
 * @author ivanng3
 */
public class FindScriptLine {

	public static void main(String[] args) {
		System.out.println("Please enter the word(s) to search for");
		String word;
		word = TextIO.getln();
		String realWord = word.toLowerCase();
		int lineNum = 0;
		
		System.out.println("Searching for " + "'" + word + "'");
		TextIO.readFile("thematrix.txt");
		
		boolean output=false;
		output = false;
		while (false == TextIO.eof()) {
			String line = TextIO.getln();
			lineNum++;
			line=line.trim();
			if (line.toLowerCase().indexOf(word.toLowerCase()) >= 0)
				output = true; // We found the character's name, time to start printing their lines
			if (line.isEmpty())
				output = false;
			if (output){
			System.out.println(lineNum + " - " + line);
			output=false;
			}
			
// TODO: Implement the functionality described in FindScriptLine.txt
// TODO: Test your code manually and using the automated unit tests in FindScriptLineTest		
	}System.out.println("Done Searching for " + "'" +word+"'");
}
}