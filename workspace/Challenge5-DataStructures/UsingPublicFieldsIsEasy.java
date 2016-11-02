//UIUC CS125 FALL 2014 MP. File: UsingPublicFieldsIsEasy.java, CS125 Project: Challenge5-DataStructures, Version: 2015-10-10T21:56:32-0500.761415177

/**
 * Complete the class method 'analyze' that takes a SimplePublicPair object as an argument
 * and returns a new SimplePublicTriple object.
 * The SimplePublicTriple needs to set up as follows:
 * x = the minimum value of 'a' and 'b'
 * y = the maximum value of 'a' and 'b'
 * description:a*b=M 
 * where a,b, and M are replaced with the numerical values of a, b and the multiplication of a and b.
 * Your code will create a SimplePublicTriple, initializes the three fields and return a reference to the SimplePublicTriple object.
 *
 *@author ivanng3
 *
 */
public class UsingPublicFieldsIsEasy{
	public static SimplePublicTriple analyze(SimplePublicPair in){
		int x= min (in.a,in.b);
		int y= max (in.a,in.b);   
		String description=""+ (in.a +"*"+ in.b + "=" + (in.a*in.b));
		SimplePublicTriple ab= new SimplePublicTriple();
		ab.x=x;
		ab.y=y;
		ab.description=description;
        return ab;
        }  
	static int min(int newX, int newY){
                if (newX<newY)
                        return newX;
                else
                        return newY;
                }
        static int max(int newX, int newY){
                if (newX>newY)
                        return newX;
                else
                        return newY;
                }
}
