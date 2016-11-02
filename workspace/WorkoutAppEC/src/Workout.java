import java.util.Scanner;
import java.util.Date;

public class Workout {
	private int count;
	private String workoutLocation;
	private String workoutBuddy;
	private double milesCovered;
	private String startingTime;
	private long duration;
	private int rating;
	private Workout next;
	
	
public Workout(){
	
}
public Workout(String location, String buddy){
	this.workoutLocation=location;
	this.workoutBuddy=buddy;
}
	
public Workout(int count, String newlocation, String newbuddy, String newStartTime, long duration, int newRating, double newMiles) {
	this.count = count;
	this.workoutLocation = newlocation;
	this.workoutBuddy = newbuddy;
	this.startingTime=newStartTime;
	this.duration=duration;
	this.rating = newRating;
	this.milesCovered = newMiles;
}

public String getWorkoutLocation() {
	return workoutLocation;
}

public void setWorkoutLocation(String workoutLocation) {
	this.workoutLocation = workoutLocation;
}

public String getWorkoutBuddy() {
	return workoutBuddy;
}

public void setWorkoutBuddy(String workoutBuddy) {
	this.workoutBuddy = workoutBuddy;
}

public double getMilesCovered() {
	return milesCovered;
}

public void setMilesCovered(double milesCovered) {
	this.milesCovered = milesCovered;
}

public String getStartingTime() {
	return startingTime;
}

public void setStartingTime(String startingTime) {
	this.startingTime = startingTime;
}

public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}

public long getDuration() {
	return duration;
}

public void setDuration(long duration) {
	this.duration = duration;
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}


}