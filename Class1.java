package basicsprograms;
class Class3
{
	static void add1()
	{
		System.out.println("add1");
	}
}


class Class2 extends Class3
{
	static void add2()
	{
		System.out.println("add2");
	}
	
}

public class Class1 extends Class2
{
	static void add3()
	{
		System.out.println("add3");
	}
	public static void main(String[] args) 
	{
		add3();
		add2();
		add1();
		
	}
}
