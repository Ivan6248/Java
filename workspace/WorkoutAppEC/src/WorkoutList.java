import java.sql.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WorkoutList{
static Scanner scan = new Scanner(System.in);
private int count = 1;
public final Workout current;
public WorkoutList next;

public WorkoutList(Workout current, WorkoutList next){
	this.current=current;
	this.next=next;
}
public static void main(String [] args){
	Workout firstWorkout = new Workout();
	WorkoutList start = new WorkoutList(firstWorkout, null);
	start.Run();
}

public void Run(){

	System.out.println("Welcome to the Workout Logger! Select an option below: \n");
	System.out.println("1) add a workout");
	System.out.println("2) remove a workout");
	System.out.println("3) display all workouts");
	System.out.println("4) display all workouts with buddy");
	System.out.println("5) display workouts for a certain location");
	System.out.println("6) PB: display personal best time for a given mileage");
	System.out.println("7) quit \n");
	System.out.println("Select an option above:");
	int input = scan.nextInt();
	if(input==1)
		Add();
	if(input==2)
		Remove();
	if(input==3)
		Display();
	if(input==4)
		DisplayBuddy();
	if(input==5)
		DisplayCertainLoc();
	if(input==6)
		PB();
	if(input==7)
		Quit();
	Run();
	

}
public void Add(){
	System.out.println("Please type in your location and any friends you are working out with \n");
	System.out.println("Location?");
	String newlocation = scan.next();
	System.out.println("Buddy? (If no buddy, type n/a)");
	String newbuddy = scan.next();
	
	System.out.println("Enter any key to start workout:");
	scan.next();
	Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    String newStartTime=sdf.format(cal.getTime());
	long StartTime=System.currentTimeMillis();
	System.out.println("Enter any key to end workout:");
	scan.next();
	long newEndTime=System.currentTimeMillis();
	long duration = newEndTime-StartTime;
	
	System.out.println("Provide a rating to workout (1: great; 10: poor)");
	int newRating = scan.nextInt();
	System.out.println("How many miles did you run?");
	double newMiles = scan.nextDouble();
	Workout newWorkout = new Workout(count, newlocation,newbuddy,newStartTime,duration, newRating, newMiles);
	append(newWorkout);
	count++;

}

public WorkoutList append(Workout newWorkout) {
	if (this.next!=null){
		this.next=this.next.append(newWorkout);
	}else{
		this.next = new WorkoutList(newWorkout, null);
	}
	return this;
}

public void Remove(){
	Display();
	System.out.println("Please enter a workout to remove");
	int remove = scan.nextInt();
	System.out.println(RemoveHelper("", remove));
	
}
public String RemoveHelper(String Display, int remove){
	if (next==null){
		if(this.current.getCount()==remove){
		return Display + count + ") " + "Location: " + this.current.getWorkoutLocation() + "	  Buddy: " + this.current.getWorkoutBuddy() + "	  StartingTime: "
				+ this.current.getStartingTime() + "	Duration: " + 
				this.current.getDuration() + " milliseconds " + "	Rating: " + this.current.getRating() + " Miles Covered: " + this.current.getMilesCovered();
		}
		else {System.out.println("Thank you");
		Run();
		}
	}else{
		if(this.current.getCount()==remove){
		String restOfString = next.toString(); // Forward Recursion
		return count + ") " + "Location: " + this.current.getWorkoutLocation() + "	   Buddy: " + this.current.getWorkoutBuddy() + "	StartingTime: "
		+ this.current.getStartingTime() + "	Duration: " + 
		this.current.getDuration() + " milliseconds " + "	Rating: " + this.current.getRating() + "	Miles Covered: " + this.current.getMilesCovered()
		+ "\n" + restOfString;
		}else
			return this.next.RemoveHelper(Display, remove);
		
	}
	return this.RemoveHelper(Display, remove);
}
public void Display(){ 
	System.out.println(toString() + "\n");

}
public String toString() {
	if (next == null)
		return count + ") " + "Location: " + this.current.getWorkoutLocation() + "	  Buddy: " + this.current.getWorkoutBuddy() + "	  StartingTime: "
			+ this.current.getStartingTime() + "	Duration: " + 
			this.current.getDuration() + " milliseconds " + "	Rating: " + this.current.getRating() + " Miles Covered: " + this.current.getMilesCovered();
			// BASE CASE; no more recursion required

	// Recursive case:
	String restOfString = next.toString(); // Forward Recursion
	return count + ") " + "Location: " + this.current.getWorkoutLocation() + "	   Buddy: " + this.current.getWorkoutBuddy() + "	StartingTime: "
	+ this.current.getStartingTime() + "	Duration: " + 
	this.current.getDuration() + " milliseconds " + "	Rating: " + this.current.getRating() + "	Miles Covered: " + this.current.getMilesCovered()
	+ "\n" + restOfString;
}

public void DisplayBuddy(){
	System.out.println("Please enter a buddy's name.");
	String buddy = scan.next();
	System.out.println(DisplayBudHelper("", buddy) + "\n");
	Run();
}
public String DisplayBudHelper(String Display, String buddy){
	if (next==null){
		if(this.current.getWorkoutBuddy().equals(buddy)){
		return Display + count + ") " + "Location: " + this.current.getWorkoutLocation() + "	  Buddy: " + this.current.getWorkoutBuddy() + "	  StartingTime: "
				+ this.current.getStartingTime() + "	Duration: " + 
				this.current.getDuration() + " milliseconds " + "	Rating: " + this.current.getRating() + " Miles Covered: " + this.current.getMilesCovered();
		}
		else {System.out.println("Sorry, no buddies with that name match your workouts");
		Run();
		}
	}else{
		if(this.current.getWorkoutBuddy().equals(buddy)){
		String restOfString = next.toString(); // Forward Recursion
		return count + ") " + "Location: " + this.current.getWorkoutLocation() + "	   Buddy: " + this.current.getWorkoutBuddy() + "	StartingTime: "
		+ this.current.getStartingTime() + "	Duration: " + 
		this.current.getDuration() + " milliseconds " + "	Rating: " + this.current.getRating() + "	Miles Covered: " + this.current.getMilesCovered()
		+ "\n" + restOfString;
		}else
			return this.next.DisplayBudHelper(Display, buddy);
		
	}
	return this.DisplayBudHelper(Display, buddy);
}

public void DisplayCertainLoc(){
	System.out.println("Please enter a location");
	String location = scan.next();
	System.out.println(DisplayCertainLocHelper("", location) + "\n");
}
public String DisplayCertainLocHelper(String Display, String location){
	if (next==null){
		if(this.current.getWorkoutLocation().equals(location)){
		return Display + count + ") " + "Location: " + this.current.getWorkoutLocation() + "	  Buddy: " + this.current.getWorkoutBuddy() + "	  StartingTime: "
				+ this.current.getStartingTime() + "	Duration: " + 
				this.current.getDuration() + " milliseconds " + "	Rating: " + this.current.getRating() + " Miles Covered: " + this.current.getMilesCovered();
		}
		else {System.out.println("Sorry, no locations with that name match your workouts");

		}
	}else{
		if(this.current.getWorkoutLocation().equals(location)){
		String restOfString = next.toString(); // Forward Recursion
		return count + ") " + "Location: " + this.current.getWorkoutLocation() + "	   Buddy: " + this.current.getWorkoutBuddy() + "	StartingTime: "
		+ this.current.getStartingTime() + "	Duration: " + 
		this.current.getDuration() + " milliseconds " + "	Rating: " + this.current.getRating() + "	Miles Covered: " + this.current.getMilesCovered()
		+ "\n" + restOfString;
		}else
			return this.next.DisplayCertainLocHelper(Display, location);
		
	}
	return this.DisplayCertainLocHelper(Display, location);
	
}
public void PB(){
	System.out.println("Enter a mileage");
	double mileage = scan.nextDouble();
	System.out.println(PBHelper("", mileage) + "\n");
}

public String PBHelper(String Display, double mileage){
	if (next==null){
		if(this.current.getMilesCovered()==mileage){
		return Display + count + ") " + "Location: " + this.current.getWorkoutLocation() + "	  Buddy: " + this.current.getWorkoutBuddy() + "	  StartingTime: "
				+ this.current.getStartingTime() + "	Duration: " + 
				this.current.getDuration() + " milliseconds " + "	Rating: " + this.current.getRating() + " Miles Covered: " + this.current.getMilesCovered();
		}
		else {System.out.println("Sorry, no workouts match that mileage.");

		}
	}else{
		if(this.current.getMilesCovered()==(mileage)){
		String restOfString = next.toString(); // Forward Recursion
		return count + ") " + "Location: " + this.current.getWorkoutLocation() + "	   Buddy: " + this.current.getWorkoutBuddy() + "	StartingTime: "
		+ this.current.getStartingTime() + "	Duration: " + 
		this.current.getDuration() + " milliseconds " + "	Rating: " + this.current.getRating() + "	Miles Covered: " + this.current.getMilesCovered()
		+ "\n" + restOfString;
		}else
			return this.next.PBHelper(Display, mileage);
		
	}
	return this.PBHelper(Display, mileage);
}

	

public void Quit(){
	System.out.println("Are you sure you want to quit? - all your data will be lost." );
	System.out.println("1)Yes");
	System.out.println("2)No");
	int input = scan.nextInt();
	if(input==1)
		System.exit(1);
	if(input==2)
		Run();
	
}

}
