package assignments;
class Parent_Class_Scanner1 extends Object
//This is how we can create multi level inheritance
{
	void add()
	{
		System.out.println("Add two numbers");
	}
	
}
public class Downcasting extends Parent_Class_Scanner1
{
	void sub()
	{
		System.out.println("Substract two numbers");
	}

	public static void main(String[] args) 
	{
		//implicit way of up casting
		Parent_Class_Scanner1 p1 = new Downcasting();
		
		//Explicit way of up casting
		Parent_Class_Scanner1 p2 = (Parent_Class_Scanner1) new Downcasting();
		
		//Explicit syntax of Down casting
		Downcasting c1 = (Downcasting)p1;
		c1.add();
		c1.sub();
		
	}

}

//Assignment 76: WAP for class type casting (combination of up casting and down casting
