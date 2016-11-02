//UIUC CS125 FALL 2014 MP. File: CallAStaticMethod.java, CS125 Project: Challenge5-DataStructures, Version: 2015-10-10T21:56:32-0500.761415177
/**
 * Prints out only lines that contain an email address Each printed line is
 * justified to right by prepending the text with '.' characters The minimum
 * width of the line including padding is 40 characters. See the test case for
 * example input and expected output.
 * 
 * @author ivanng3
 */
class CallAStaticMethod {

	public static void main(String[] args) {

		while (!TextIO.eof()) {
			String line = TextIO.getln();
			if (ExampleClassMethods.isEmailAddress(line))
			// Use ExampleClassMethods
			// 'isEmailAddress' and 'createPadding' to complete this method
			TextIO.putln(ExampleClassMethods.createPadding('.', 40-line.length())+line);
		}

	}
}
