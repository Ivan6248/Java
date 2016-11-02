//UIUC CS125 FALL 2014 MP. File: KeyValueMap.java, CS125 Project: Challenge5-DataStructures, Version: 2015-10-10T21:56:32-0500.761415177
/**
 * @author ivanng3
 */
import java.awt.Color;

public class KeyValueMap { // aka Dictionary or Map/
private Color [] col = new Color[0];
private String [] map = new String[0];
private int size =0;
	/**
	 * Adds a key and value. If the key already exists, it replaces the original
	 * entry.
	 */
public void add(String key, Color value) {

              this.size++;
              
              String temp1[] = new String[size];
             
              for (int k=0; k<size-1;k++){
            	  temp1[k]=map[k];
              }
              temp1[size-1]=key;
              map=temp1;
              
              Color temp2[] = new Color[size];
              for (int k=0;k<size-1;k++)
            	  temp2[k]=col[k];
              temp2[size-1]=value;
              col=temp2;
              
}
           
	/**
	 * Returns particular Color object previously added to this map.
	 */
	public Color find(String key) {
		
		for (int i=0;i<size;i++)
			if (map[i].equalsIgnoreCase(key))
				return col[i];
		
		
		return null;
	}

	/**
	 * Returns true if the key exists in this map.
	 */
	public boolean exists(String key) {
		for (int i=0;i<size;i++){
			if (this.map[i].equals(key))
				return true;
		}
		return false;
	}

	/**
	 * Removes the key (and the color) from this map.
	 */
	public void remove(String key) {
		size--;
		int i=0;
		String temp1[]=new String[size];
		Color temp2[]=new Color[size];
		for (int k=0;k<size;k++)
			if (map[k].equals(key)){
				col[k]=null;
				map[k]=null;
				i=k;
			}
		for (int k=0;map[k]!=null;k++){
			temp1[k]=map[k];
			temp2[k]=col[k];
		}
		for (int k=i;k<size;k++){
			temp1[k]=map[k+1];
			temp2[k]=col[k+1];
		}
		map=temp1;
		col=temp2;
	}

}
