//UIUC CS125 FALL 2014 MP. File: MyScriptPrinter.java, CS125 Project: Challenge2-Hollywood, Version: 2015-09-14T13:28:26-0500.244411492
/**
 * A program to print one actor's lines. 
 * See ScriptPrinter.txt for more information.
 * TODO: add your netid to the line below
 * @author ivanng3
 */
public class MyScriptPrinter {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean output=false; //Set to true when we find the desired character
		String name=""; // Only print lines for this character
		TextIO.putln("Which character's lines would you like? (NEO,MORPHEUS,ORACLE)");
		name = TextIO.getln();
		name = name.toUpperCase();
		TextIO.readFile("thematrix.txt"); // stop reading from the keyboard- use the script
		System.out.println(name + "'s" + " lines:");

		//TODO: Print the name here (see ScriptPrinter.txt example output for format)
		
		output = false; // initially don't print anything

		// This loop will read one line at a time from the script until it
		// reaches the end of the file and then TextIO.eof() will return true.
		// eof means end-of-file
		while (false == TextIO.eof()) {
			String line = TextIO.getln(); // Read the next line
			line = line.trim();
			if (line.length() <= 0){
			output = false;
			}
			
			if (output){
			TextIO.putln(name + ":\"" + line + "\"");
			}
	
		
		
			if (line.indexOf(name) >= 0){
				output = true; 
			}
	
		}
		System.out.println("---");
		//TODO: Print 3 dashes here to indicate processing is complete
	}
}
