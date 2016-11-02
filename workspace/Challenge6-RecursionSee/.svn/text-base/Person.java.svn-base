//UIUC CS125 FALL 2014 MP. File: Person.java, CS125 Project: Challenge6-RecursionSee, Version: 2015-10-26T21:21:49-0500.013987980
/**
 * @author ivanng3
 *
 */
public class Person
{
private final String name;
private final int age;
private final char gender;
private final Person child1; //left child
private final Person child2; //right child

public Person(String name, int age, char gender, Person c1, Person c2)
{
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.child1 = c1;
    this.child2 = c2;
}

public String toString()
{
    return name+"*"+age+"*"+gender;
}

public String getName() 
{
	return name;
}

public int getAge() 
{
	return age;
}

public char getGender() 
{
	return gender;
}

public boolean equals(Person p)
{
	return (this.name.equals(p.name)) &&
			(this.age==p.age) &&
			(this.gender==p.gender);
}


public void print() 
{
   System.out.println(this);
   if(child1 != null)
       child1.print();
   if(child2 != null)
       child2.print();
   
}

public int count() // total person count including this object
{
	if (child1 == null && child2 == null)
		return 1;
	if (child1 == null && child2!=null)
		return 1 + this.child2.count();
	if (child2==null && child1!=null)
		return 1+this.child1.count();
	return 1+this.child1.count()+this.child2.count();
}
public int countGrandChildren() // but not greatGrandChildren
{
	int c=0;
	if (child1!=null){
		if (child1.child1!=null)
			c++;
		if (child1.child2!=null)
			c++;
	}
	if (child2!=null){
		if (child2.child1!=null)
			c++;
		if (child2.child2!=null)
			c++;
	}
	
	return c;

}

public int countMaxGenerations()
{
	int left=1;
	int right=1;
	if (child1!=null)
		left+= child1.countMaxGenerations();
	if (child2!=null)
		right+= child2.countMaxGenerations();
	return Math.max(left, right);
		
}

public int countGender(char gen)
{
	int c=0;
	if (this.gender==gen)
		c++;
	if (child1!=null)
		c+=child1.countGender(gen);
	if (child2!=null)
		c+=child2.countGender(gen);
	
	return c;
		
}


public Person search(String name, int maxGeneration)
{
	Person a, b;
	if (maxGeneration>0){
	if (this.name.equals(name))
		return this;
	else if (child1==null && child2==null)
		return null;
	if (child1!=null)
		a = this.child1.search(name,maxGeneration-1);
	else a=null;
	if (child2!=null)
		b= this.child2.search(name, maxGeneration-1);
	else b=null;	
	
	if (a!=null)
		return a;
	else if (b!=null)
		return b;
	else return null;
}
	else return null;
}

} // end of class
