//UIUC CS125 FALL 2014 MP. File: BinarySearch.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2015-11-17T19:08:15-0600.633466837
public class BinarySearch {
	/** Wrapper method. Just runs the recursive search method below for the entire array
	 * @author ivanng3
	 * */
	
	public static boolean search(int[] array, int key) {
		return search(array, key, 0, array.length - 1);
	}

	/**
	 * Recursive search using Divide 3and Conquer approach:
	 * The given array is already sorted so we can very quickly discover if the key is in the array or not.
	 * Hint: For the recursive case check the value at (lo+hi)/2
	 * and proceed accordingly.
	 */
	static boolean search(int[] array, int key, int lo, int hi) {
		int mid = (lo+hi)/2;
		if (hi<lo)
			return false;
		if(array[mid]==(int)key)
			return true;
		else 
			if (key<array[mid])
				return search(array,key,lo,mid-1);
			else if (key>array[mid])
				return search(array,key,mid+1,hi);
		
	return false;
		
	}
}
