//UIUC CS125 FALL 2014 MP. File: OddSum.java, CS125 Project: Challenge3-TopSecret, Version: 2015-09-20T21:45:34-0500.312230943
/**
 * Prints sum of odd numbers in a specific format.
 * TODO: add your netid to the line below
 * @author ivanng3
 */
public class OddSum { 
	public static void main(String[] args) {
String line = "";

int sum = 0;
System.out.println("Max?");
int number = TextIO.getlnInt();

for (int x=1; x<=number; x++){
	if (x %2 == 1 && x + 2 <= number) {
	line = line + (x + " + ");
	sum = sum + x;
	}
	if ( x % 2 ==1 && x + 2 > number )
	{
		line = line + x;
		sum = sum + x;
	}
}
	System.out.println(line + " = " + sum);
	System.out.print(sum + " = " + (number %2 == 0 ? number-1:number));
	for(int i=number % 2 == 0 ? number - 3 : number - 2;i>0;i-=2)
	System.out.print(" + " + i);


}
}


	/**
 * 
Example output if user enters 10:
Max?
1 + 3 + 5 + 7 + 9 = 25
25 = 9 + 7 + 5 + 3 + 1

Example output if user enters 11:
Max?
1 + 3 + 5 + 7 + 9 + 11 = 36
36 = 11 + 9 + 7 + 5 + 3 + 1

 */
 
