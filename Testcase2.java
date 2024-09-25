package basicsprograms;

class ProgramR 
{
	ProgramR(String a)
	{
		System.out.println("Reporting"); 
	}
}
class Program2 extends ProgramR
{
	Program2(int a,int b)
	{
		super("MKT");
		System.out.println("Screenshot");
	}
}
public class Testcase2 extends Program2
{
	Testcase2()
	{
		super(10,20);
		System.out.println("Test case");
	}

	public static void main(String[] args) 
	{
		new Testcase2();
		
	}

}

//Parameterized super ()-Assignment 18