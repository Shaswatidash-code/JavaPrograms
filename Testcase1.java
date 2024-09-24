package basicsprograms;
class Reporting
{
	Reporting()
	{
		super();
		System.out.println("Reporting");
	}
}
class Screenshot extends Reporting
{
	Screenshot()
	{
		super();
		System.out.println("Screenshot");
	}
}
public class Testcase1 extends Screenshot
{
	Testcase1()
	{
		super();
		System.out.println("Test case");
	}
public static void main(String[] args) {
	new Testcase1();
}
}


//super calling statment