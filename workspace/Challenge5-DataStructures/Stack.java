//UIUC CS125 FALL 2014 MP. File: Stack.java, CS125 Project: Challenge5-DataStructures, Version: 2015-10-10T21:56:32-0500.761415177
/***
 * 
 * @author ivanng3
 *
 */
public class Stack {
	public String[]stax=new String[0];
	public int count=0;
	
	/** Adds a value to the top of the stack.*/
	public void push(String value){
		this.count++;
		String[]temp = this.stax;
		this.stax=new String[count];
		stax[0]=value;
		
		for (int k=1;k<count;k++){
			stax[k]=temp[k-1];
		}
	}
	
	/** Removes the topmost string. If the stack is empty, returns null. */
	public String pop() {
		if (count!=0){
		this.count--;
		String[]arrtemp=this.stax;
		this.stax=new String[count];
		for (int k=0;k<count;k++)
			stax[k]=arrtemp[k+1];
		return arrtemp[0];
		}
		
		else return null;
		
	}
	
	/** Returns the topmost string but does not remove it. If the stack is empty, returns null. */
	public String peek() {
		if (this.length()>0)
			return stax[0];
		else
			return null;
	}
	
	/** Returns true iff the stack is empty */
	public boolean isEmpty() {
		if (this.length()==0){
			return true;
		}
		return false;
	}

	/** Returns the number of items in the stack. */
	public int length() {
		return this.count;
	}
	
	/** Returns a string representation of the stack. Each string is separated by a newline. Returns an empty string if the stack is empty. */
	public String toString() {
		if (this.length()>0){
		String s = "";
        for (int i=count-1; i>=0; i--)
                s=s+stax[i]+"\n";
        return s;
		}
		else return null;
	}
}
