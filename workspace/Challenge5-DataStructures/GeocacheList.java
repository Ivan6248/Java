//UIUC CS125 FALL 2014 MP. File: GeocacheList.java, CS125 Project: Challenge5-DataStructures, Version: 2015-10-10T21:56:32-0500.761415177
/**
 * Complete the following GeocacheList, to ensure all unit tests pass.
 * There are several errors in the code below
 *
 * Hint: Get the Geocache class working and passing its tests first.
 * @author ivanng3
 */
public class GeocacheList {
	private Geocache[] data = new Geocache[0];
	private int size = 0;

	public Geocache getGeocache(int i) {
		return data[i];
	}

	public int getSize() {
		return size;
	}

	public GeocacheList() {
	}

	public GeocacheList(GeocacheList other, boolean deepCopy) {
		data = new Geocache[other.data.length];
		size = other.size;
		for (int i=0; i<size;i++){
			if (deepCopy){
				data[i]=new Geocache(other.data[i]);
			}
			else{
				data[i]=other.data[i];
			}
		}
		
	}

	public void add(Geocache p) {
		size++;
		if (size > data.length) {
			Geocache[] old = data;
			data = new Geocache[size+1];
			for (int i = 0; i < old.length; i++)
				data[i] = old[i];
		}
		data[size-1] = p;
	}

	public Geocache removeFromTop() {
		size--;
		return data[size];
	}

	public String toString() {
		StringBuffer s = new StringBuffer("GeocacheList:");
		for (int i = 0; i < size; i++) {
			if (i > 0)
				s.append(',');
			s.append(data[i]);
		}
		return s.toString();
}	}
