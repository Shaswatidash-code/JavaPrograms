package assignments;
class Play
{
	Play()
	{
		super();
		System.out.println("Play everyday");
	}
}
class Wash extends Play
{
	Wash()
	{
		super();
		System.out.println("Wash the clothes");
	}
}

public class SuperNonParam extends Wash {
	SuperNonParam()
	{
		super();
		System.out.println("Play and Wash everyda");
	}
	public static void main(String[] args) {
		new SuperNonParam();
	}

}

// Assignment 17: WAP on non parameterized super calling statement (within multiple class)
