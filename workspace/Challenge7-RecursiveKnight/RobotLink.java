//UIUC CS125 FALL 2014 MP. File: RobotLink.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2015-11-17T19:08:15-0600.633466837
/***
 * 
 * @author ivanng3
 *
 */
public class RobotLink {

	private RobotLink next; 	
	private final Robot robot;

	public Robot getRobot() {
		return robot;
	}
	/** Constructs this link.
	 * @param next ; the next item in the chain (null, if there are no more items).
	 * @param robot ; a single robot (never null).
	 */
	public RobotLink(RobotLink next,Robot robot) {
		this.robot = robot;
		this.next = next;
	}

	/**
	 * Returns the number of entries in the linked list.
	 * @return number of entries.
	 */
	public int count() {
		if (next == null)
			return 1; // BASE CASE; no more recursion required!

		// Recursive case:
		return 1 + next.count();
	}
	/**
	 * Counts the number of flying robots in the linked list.
	 * Hint: robot.isFlying is useful here.
	 */
	public int countFlyingRobots() {
	int count = 0;
		if (next==null && this.robot.isFlying())
			return 1 + count;
		
		if (next==null && !this.robot.isFlying())
			return count;
		
		if (next!=null && this.robot.isFlying())
			count++;
			
		return count+this.next.countFlyingRobots();
	
	}
	/**
	 * Counts the number of flying robots upto and excluding a sad robot.
	 * (i.e. do not count the sad robot if it is flying).
	 * If there are no sad robots this function will return the same value as countFlyingRobots().
	 * Hint: robot.isHappy() is useful.
	 */
	public int countFlyingRobotsBeforeSadRobot() {
		int count = 0;
	
		if (next==null && this.robot.isFlying() && this.robot.isHappy())
			return 1+count;
		if (next==null & !this.robot.isFlying() || !this.robot.isHappy())
			return count;
		else if(next!=null){
		if (this.robot.isFlying() && next.robot.isHappy())
			return 1+next.countFlyingRobotsBeforeSadRobot();
		if (this.robot.isFlying() && next.robot.isHappy()==false)
			return 1+count;
		}
		return count + this.next.countFlyingRobotsBeforeSadRobot();
		
	}
	/** Creates a new LinkedList entry at the end of this linked list.
	 * Recursively finds the last entry then adds a new link to the end.
	 * @param robot - the robot value of the new last link
	 */
	public void append(Robot robot) {
		if (next==null)
			next=new RobotLink(null, robot);
		else
		this.next.append(robot);
	}
	/**
	 * Returns the first flying unhappy robot, or null
	 * if there are not robots that are flying and unhappy.
	 * @return
	 */
	public Robot getFirstFlyingUnhappyRobot() {
		if (next==null && this.robot.isFlying() && this.robot.isHappy())
			return null;
		if (this.robot.isFlying() && !this.robot.isHappy())
		return this.robot;
		return this.next.getFirstFlyingUnhappyRobot();
	}
	/**
	 * Returns the last flying unhappy robotn the linked list, or null
	 * if there are not robots that are flying and unhappy.
	 * @return
	 */
	public Robot getLastFlyingUnhappyRobot() {
		 if (next==null)
			 if (!this.robot.isHappy() && this.robot.isFlying())
				 return this.robot;
			 else return null;
		 if (this.robot.isFlying() && !this.robot.isHappy() && this.next.getLastFlyingUnhappyRobot()==null)
			 return this.robot;
		 return this.next.getLastFlyingUnhappyRobot();
		 
	}
	/**
	 * Returns a reference to the happy most distant explorer.
	 * Returns null if there are no happy robots
	 * @return reference to the most distant happy robot
	 */
	public Robot findHappyRobotFurthestFromHome() {
			if (next==null && !this.robot.isHappy())
				return null;
			if (this.robot.isHappy()){
			if (this.robot.getDistanceFromHome()<this.next.robot.getDistanceFromHome())
			return this.next.findHappyRobotFurthestFromHome();
			}
			return this.robot;			
	}
	/**
	 * Returns true if linked list contains the robot.
	 * Hint: Use robot.equals(other).
	 * @param robot
	 * @return
	 */
	public boolean contains(Robot other) {
		if (next==null && !this.robot.equals(other))
			return false;
		else if (this.robot.equals(other))
			return true;
		return this.next.contains(other);

	}

	
}
