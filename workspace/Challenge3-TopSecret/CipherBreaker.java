//UIUC CS125 FALL 2014 MP. File: CipherBreaker.java, CS125 Project: Challenge3-TopSecret, Version: 2015-09-20T21:45:34-0500.312230943
/**
 * See CipherBreaker.txt for instructions.
 * TODO: add your netid to the line below
 * 
 * @author ivanng3
 */
public class CipherBreaker {

	public static void main(String[] args) {
		TextIO.putln("Text?");
		String line = TextIO.getln();
		TextIO.putln(line);
		String input;
		int digits = 0;
		int space = 0;
		int punctuation = 0;
		int count[] = new int['Z'+1];
		input = line.toUpperCase();
		for(int i = 0;i<input.length();i++){
			if (input.charAt(i) >= '0' && input.charAt(i) <= '9')
				digits++;
			if (input.charAt(i) == ' ')
				space++;
			if (input.charAt(i) == '"' || input.charAt(i) == '-' || input.charAt(i) == '\'' || input.charAt(i) == '.' ||
					input.charAt(i) == '!' || input.charAt(i) == ',')
				punctuation++;
			if (input.charAt(i) >= 'A' && input.charAt(i)<= 'Z')
				count[input.charAt(i)]++;
		
		}
		for (int i='A';i<='Z';i++){
		 if (count[i]>0)
			 System.out.println(((char)i) + ":" + count[i]);
		} 
		 if (digits > 0)
             System.out.println("DIGITS:" + digits);
		 if (space > 0)
             System.out.println("SPACES:" + space);
		 if (punctuation > 0)
             System.out.println("PUNCTUATION:" + punctuation);
			
		

}
}

