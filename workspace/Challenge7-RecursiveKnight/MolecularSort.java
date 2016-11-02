//UIUC CS125 FALL 2014 MP. File: MolecularSort.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2015-11-17T19:08:15-0600.633466837
/***
 * 
 * @author ivanng3
 *
 */
public class MolecularSort {

	/** Sorts each xyz coordinate using it's Z value (coord[i][2] <= coord[j][2] for i<j). */
	static void sortCoordsByZ(double[][] coords) {
		// TODO: Implement this wrapper method.
		//All the work is performed by recursiveSort
		recursiveSort(coords, 0, coords.length-1);
	}

	/**
	 * recursively sorts coordinates entries by their z value. Entries between
	 * lo and hi inclusive are considered.
	 */
	static void recursiveSort(double[][] coords, int lo, int hi) {
		// TODO: write the four lines of a recursive selection sort here.
		if (lo<hi){
			swap(coords, lo, findIndexOfZMinimum(coords,lo,hi));
			recursiveSort(coords,lo+1,hi);
		}
	
	}

	/**
	 * returns the index of the entry with the lowest Z value. Entries between
	 * lo and hi inclusive are considered.
	 */
	static int findIndexOfZMinimum(double[][] coords, int lo, int hi) {
		// TODO: Replace this with your three lines of recursive code
		if (lo==hi)
			return lo;
		if(coords[lo][2]>coords[hi][2])
			return findIndexOfZMinimum(coords,lo+1,hi);
		else return findIndexOfZMinimum(coords,lo,hi-1);
	}
	

	/* Swaps the (x,y and z) values of the i-th and j-th coordinates.*/
	static void swap(double[][] coords, int i, int j) {
		// TODO: write your swap implementation here
	
	double temp[]=coords[i];
	coords[i]=coords[j];
	coords[j]=temp;
	
	}
	
	
	

}
