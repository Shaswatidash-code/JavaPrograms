package basicsprograms;

public class ConstructoroverThis {
	ConstructoroverThis()
	{
		this(45);
		System.out.println("1st");
	}
	ConstructoroverThis(int a)
	{
		this(100,200);
		System.out.println("2nd");
	}
	ConstructoroverThis(int a,int b)
	{
		this(28,"Arun");
		System.out.println("3rd");
	}
	ConstructoroverThis(int a,String b)
	{
		System.out.println("4th");
	}

	public static void main(String[] args) {
		new ConstructoroverThis();
	}

}

//this calling statement-Assignment 19