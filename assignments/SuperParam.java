package assignments;
class ProgramWrite
{
	ProgramWrite(int a, String b)
	{
		System.out.println("Daily practice program");
	}
}

class ProgramExecute extends ProgramWrite
{
	ProgramExecute(String a)
	{
		super(90, "Execute");
		System.out.println("Execute the program");
	}
}

class ProgramVerify extends ProgramExecute
{
	ProgramVerify(int c, int d)
	{
		super("Java Program");
		System.out.println("Verify the program thoroughly");
	}
}


public class SuperParam extends ProgramVerify
{
	SuperParam(double e)
	{
		super(8,9);
		System.out.println("super parameter");
	}
	public static void main(String[] args) 
	{
		new SuperParam(89.0);
	}
	

}

//Assignment 18: WAP on parameterized super calling statement (with in multiple classes)
