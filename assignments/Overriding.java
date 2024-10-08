package assignments;
class Math
{
	void add()
	{
		System.out.println("Super class");
	}
}
class Math1 extends Math
{
	void add()
	{
		System.out.println("Sub class");
	}
}
public class Overriding{
	public static void main(String[] args) {
		Math1 m1 = new Math1();
		m1.add();
		
	}

}

//Assignment 20: WAP on Method Overriding
