//UIUC CS125 FALL 2014 MP. File: CaesarCipher.java, CS125 Project: Challenge3-TopSecret, Version: 2015-09-20T21:45:34-0500.312230943
/**
 * A program to search for to encrypt and decrypt lines of text. See
 * CaesarCipher.txt
 * Hints: line.charAt( int ) is useful.
 * You'll need loops, and conditions and variables
 * You'll need to read the Test cases to understand how your program should work.
 * Good Programming Hints: "DRY: Don't Repeat Yourself"
 * Try to make your program as short as possible.
 * TODO: add your netid to the line below
 * @author ivanng3
 */
public class CaesarCipher {

	public static void main(String[] strings) {
		
	int shiftValue=0;
	String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	while(shiftValue<-25 || shiftValue>25 || shiftValue == 0){
		System.out.println("Please enter the shift value (between -25..-1 and 1..25)");
		shiftValue=TextIO.getlnInt();
		if (shiftValue == 999 || shiftValue == -999){
			System.out.println("Using position shift");
			break;
		}
		if (shiftValue<-25 || shiftValue>25 || shiftValue == 0)
			System.out.println(shiftValue + " is not a valid shift value.");
		else
			System.out.println("Using shift value of " + shiftValue);
	
	}

while (true){
	System.out.println("Please enter the source text (empty line to quit)");
	String source = TextIO.getlnString();
	String input = source.toUpperCase();
	if(source.length()==0){
		System.out.println("Bye.");
		break;
	}
	if (input!=""){
		System.out.println("Source   :" +  source);
		String processed="";
		
		for (int i=0; i<input.length();i++){
			char c=0;	
			int indexOfLetter = characters.indexOf(input.charAt(i));
			
			if(shiftValue == 999){
				c= indexOfLetter >-1?(char) (characters.charAt((indexOfLetter + i + 52)%26)) : input.charAt(i);
			}
			else if(shiftValue == -999){
				c= indexOfLetter >-1?(char) (characters.charAt((indexOfLetter - i + 78)%26)) : input.charAt(i);
			}
			else{
				c= indexOfLetter >-1?(char) (characters.charAt((indexOfLetter + shiftValue + 52)%26)) : input.charAt(i);}
				processed = processed + c;
		}
	
			System.out.println("Processed:" + processed);	
	
	}
}
	}
}
	
	

	
	
	
