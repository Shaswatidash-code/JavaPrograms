package assignments;

public class ConstructorOverThis {
	ConstructorOverThis()
	{
		System.out.println("My 1st constructor");
	}
	ConstructorOverThis(int a, double b)
	{
		this();
		System.out.println("My 2nd constructor");
	}
	ConstructorOverThis(int a)
	{
		this(80,0.78);
		System.out.println("My 3rd constructor");
	}
	ConstructorOverThis(int a, String b, char c)
	{
		this(6);
		System.out.println("My 4th constructor");
	}
	ConstructorOverThis(double b)
	{
		this(5,"Tree",'S');
		System.out.println("My 5th constructor");
	}

	public static void main(String[] args) {
		new ConstructorOverThis(0.05);
		
		
	}

}

//Assignment 19: WAP on parameterized and non- parameterized this calling statement in java
