//UIUC CS125 FALL 2014 MP. File: Geocache.java, CS125 Project: Challenge5-DataStructures, Version: 2015-10-10T21:56:32-0500.761415177
/**
 * Create a class 'Geocache' with two private instance variables 'x' 'y' of type double and a private integer 'id'
 * .
 * A class variable 'count' will also be required to count the number of times a Geocache object has been created (instantiated).
 * Create two constructors - one which takes two double parameters (the initial values of x,y). The
 * second constructor will take another Geocache and initialize itself based on that geocache.
 * 
 * For both constructors set the Geocache's id to the current value of count (thus the first geocache will have the value zero)
 * when the Geocache is created, then increment the count value. 
 * 
 * Also create 'resetCount()' and getNumGeocachesCreated() which returns an int - the number of geocaches created since 
 * resetCount() method was called.
 * 
 * Create an equals method that takes an object reference and returns true if the given object equals this object.
 * Hint: You'll need 'instanceof' and cast to a (Geocache)
 * 
 * Create a toString() method that returns a string representation of this object in the form '(x,y)' where 'x' and 'y'
 * are the current values of x,y.
 * 
 * Create the four getX/getY/setX/setY methods for x,y.
 * However the setX() method will only change the Geocache's x value if the given value is between -1000 and 1000 exclusive (i.e. -1000<x<1000).
 * If the value is outside of this range, the new value is ignored and the Geocache's x value remains unchanged.
 *   
 * Create a get method for id.
 * @author ivanng3
 */
class Geocache {
	private static int count = 0;
	private double x;
	private double y;
	private int id;
	
public Geocache(double newX, double newY){
	this.x=newX;
	this.y=newY;
	id=count;
	count++;	
}
public Geocache(Geocache other){
	this.x=other.x;
	this.y=other.y;
	id=count;
	count++;	
}
public static int resetCount(){
	return count =0;
}
public static int getNumGeocachesCreated(){
	return count;
}
public boolean equals(Geocache another){
	if (another.x==this.x && another.y==this.y)
		return true;
	else
		return false;
}
public String toString(){
	return ("(" + this.x + "," + this.y + ")");
}
public double getX(){
	return this.x;
}
public double getY(){
	return this.y;
}
public void setX(double x){
	if(x<1000.0 && x>-1000.0)
		this.x=x;
}
public void setY(double y){
	this.y=y;
}
public int getId(){
	return this.id;
}
}
