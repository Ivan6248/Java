//UIUC CS125 FALL 2014 MP. File: Queue.java, CS125 Project: Challenge5-DataStructures, Version: 2015-10-10T21:56:32-0500.761415177
/***
 * 
 * @author ivanng3
 *
 */
public class Queue {
	private int size=0;
	private double q[]=new double[size];
	/** Adds the value to the front of the queue.
	 * Note the queue automatically resizes as more items are added. */
	public void add(double value) {
		size++;
		double temp[] = new double [size];
		for (int i=size-1;i>0;i--){
			temp[i]=q[i-1];
		}
		temp[0]=value;
		q=temp;
	}
	/** Removes the value from the end of the queue. If the queue is empty, returns 0 */
	public double remove() {
		if (q.length==0)
			return 0;
		size--;
		double temp[] = new double [size];
		double last=q[q.length-1];
		for (int i=size-1;i>=0;i--){
			temp[i]=q[i];
		}
		q=temp;
		return last;
		
	}
	
	/** Returns the number of items in the queue. */
	public int length() {
		return size;		
	}
	
	/** Returns true iff the queue is empty */
	public boolean isEmpty() {
		if (q.length==0)
			return true;
		return false;
	}
	
	/** Returns a comma separated string representation of the queue. */
	public String toString() {
		String com = "";
		com=q[0]+com;
		for (int i=0;i<size-1;i++)
			com=q[i+1]+","+com;
		
	return com;
	}
}
