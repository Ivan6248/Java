//UIUC CS125 FALL 2014 MP. File: GeneAnalysis.java, CS125 Project: Challenge6-RecursionSee, Version: 2015-10-26T21:21:49-0500.013987980
/**
 * @author ivanng3
 *
 */
public class GeneAnalysis
{
	/** Wrapper method. Returns the length of the longest 
	 * common subsequence
	 */
	public static int score(String gene1, String gene2)
	{
	char [] g1 = gene1.toCharArray();
	char [] g2 = gene2.toCharArray();
	if (gene1.length()==0 || gene2.length() ==0)
		return 0;
	int subS = score(g1, g2, g1.length-1, g2.length-1);
	return subS;
	
	

		// Hint: Use toCharArray() to convert each string to a char array.
		 // call your recursive implementation here with
		// the genes as char arrays, starting at the end of each gene.
	}

	private static int score(char[] g1, char[] g2, int i, int j) {
		if (i<0 || j<0)
			return 0;
		int S1 = score(g1, g2, i-1, j);
		int S2 = score(g1, g2, i, j-1);
		int S3 = score(g1, g2, i-1, j-1);
		if (g1[i]==g2[j])
			return (S3)+1;
		if (S3<S1 || S3>S2)
			return S1;
		else if (S3>S2)
			return S1;
		else return S2;

	/** Implements longest common subsequence recursive search
The recursive case is defined as
					S(i-1, j)
S(i,j) = max {		S(i,j-1)
					S(i-1,j-1)
					S(i-1,j-1) +1 if gene1[i] = gene2[j]

NB  0<=i < gene1.length
    0<=j < gene2.length

You need to figure out the base case.
	 * */
//	define a private recursive Class method 'score' that 
//	returns an integer the score.
//	The method should take four parameters- 
//	two char arrays and two integers (gene1,gene2,i,j)
//	i and j are the indices into gene1 and gene2 respectively.

	}
}
// Use local variables to store a recursive result so that you  do not need to calculate it again.

// Do not use a loops.
