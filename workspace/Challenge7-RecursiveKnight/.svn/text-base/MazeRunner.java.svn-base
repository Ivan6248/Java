//UIUC CS125 FALL 2014 MP. File: MazeRunner.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2015-11-17T19:08:15-0600.633466837
/***
 * 
 * @author ivanng3
 *
 */
public class MazeRunner {

	private int x, y;

	/** Initializes the MazeRunner with the x,y values */
	public MazeRunner(int x, int y) {	
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}


	/** Moves the runner one unit. No error checking is performed.
	 * 'N':go North (increment y), S:decrement y, E(increment x), W(decrement x)
	 * character values other than N,S,E or W are ignored.
	 */
	void moveOne(char dir) {
		//		 TODO: Implement moveOne
		if (dir=='N')
			y++;
		if (dir=='S')
			y--;
		if (dir=='E')
			x++;
		if (dir=='W')
			x--;
		

	}
	/** Returns true if this maze runner is on the same (x,y) square
	 * as the parameter. Assumes that the parameter is non-null.
	 */
	public boolean caught(MazeRunner other) {
		if (this.x==other.x && this.y==other.y)
			return true;
		return false; // TODO: Implement caught
	}

	/**
	 * Uses recursion to find index of the shortest string.
	 * Null strings are treated as infinitely long.
	 * Implementation notes:
	 * The base case if lo == hi.
	 * Use safeStringLength(paths[xxx]) to determine the string length.
	 * Invoke recursion to test the remaining paths (lo +1)
	 */
	static int findShortestString(String[] paths, int lo, int hi) {
		if(lo==hi)
		return lo;
		
		int low=findShortestString(paths, lo+1, hi);
		
		if(safeStringLength(paths[lo])>safeStringLength(paths[low]))
			return low;
			
		return lo; // TODO: findShortestString
	}

	/** Returns the length of the string or Integer.MAX_VALUE
	 * if the string is null.
	 * @param s
	 * @return
	 */
	static int safeStringLength(String s) {
		if (s==null)
			return Integer.MAX_VALUE;
		return s.length();
		//TODO: safeStringLength
	}


	/* Returns a string representation of the shortest path between
	 * (x,y) and (tx,ty). e.g. a result of "NNEE"
	 * means to travel from (x,y) -> (tx,ty) go North twice, then East twice.
	 * blocked is a square boolean grid of points that cannot be used.
	 * If(x,y) are invalid coords (outside of the grid array) this method returns null.
	 * If(x,y) is on a blocked square, this method returns null. Otherwise,
	 * If(x,y) are already the same as the target position, returns an empty string.
	 * If there is no path between (x,y) and (tx,ty) the method returns null.
	 * 
	 * Implementation notes:
	 * Use the statements above for the base cases.
	 * For the recursion part:
	 * 1. Set the current position to blocked (so that the recursive method does not
	 * attempt to re-use this square again)
	 * 2. Collect all paths from the NSEW neighbors
	 * 3. Reset the current blocked position to false.
	 * 4. Use findShortestString to determine the shortest path
	 * 5. If its non-null then PREPEND the compass direction of that neighbor's path.
	 * e.g. if the Northern neighbor returned "EWWS" 
	 * the East neighbor returned "NWWWWWWWSEEEESS" and W and S Neighbor return null
	 * then return "N" + "EWWS"
	 * Otherwise, just return null as none of the neighbors found a path.
	 */
	public static String shortestPath(int x, int y, int tX, int tY, boolean blocked[][]) {
		if (x<0 || y<0) // TODO: BASE CASES HERE
			return null;
		if (x>blocked.length-1 || y>blocked.length-1)
			return null;
		if (blocked[x][y])
			return null;
		if (x==tX && y==tY)
			return "";
	
		
		blocked[x][y] = true;
		//String[] paths = { 
			//TODO: COLLECT RECURSIVE RESULTS HERE
		//};
		
		String path1 = shortestPath(x+1,y,tX,tY,blocked);
		String path2 = shortestPath(x-1,y,tX,tY,blocked);
		String path3 = shortestPath(x,y+1,tX,tY,blocked);
		String path4 = shortestPath(x,y-1,tX,tY,blocked);
		String[] paths = {path1,path2,path3,path4};
		blocked[x][y] = false;
	

		// TODO: Use findShortestString on paths
		
		int numOfShortestPath = findShortestString(paths,0,paths.length-1);
		String theShortestPath = paths[numOfShortestPath];
		// TODO: Return correct string with Compass direction prepended (or null)
		if (theShortestPath==null)
			return null;	
		if (numOfShortestPath==0)
			theShortestPath="E" + theShortestPath;
		if (numOfShortestPath==1)
			theShortestPath="W" + theShortestPath;
		if (numOfShortestPath==2)
			theShortestPath="N" + theShortestPath;
	
		if (numOfShortestPath==3)
			theShortestPath="S" + theShortestPath;
		
		return theShortestPath;
			
	}

	/** Moves the runner towards the target position, if the
	 * shortest path can be found between the current and target position.
	 * Implementation notes: calls shortestPath, 
	 * if result is not null then send the first char to moveOne()
	 * Hint: watch out for the empty string when target = current position...
	 */
	public void chase(boolean maze[][], int targetX, int targetY) {
		if (shortestPath(x,y,targetX,targetY,maze)=="")
			return;
		if (safeStringLength(shortestPath(x,y,targetX,targetY,maze))==Integer.MAX_VALUE)
			return;
		if (shortestPath(x, y,targetX,targetY,maze)!=null)
			this.moveOne(shortestPath(x,y,targetX,targetY,maze).charAt(0));
		
		// TODO: Implement chase
		// Use shortestPath, string.charAt,  moveOne
	}

}
