package basicsprograms;

class Class4
{
	static void add1()
	{
		System.out.println("add1");
	}
}
class InhClass3 extends Class4
{
	static void add2()
	{
		System.out.println("add2");
	}
}

class InhClass2 extends InhClass3
{
	static void add3()
	{
		System.out.println("add3");
	}
}
public class AssignInhClass1 extends InhClass2
{
	static void add4()
	{
		System.out.println("add4");
	}
	public static void main(String[] args) 
	{
		add4();
		add3();
		add2();
		add1();
		
	}

}
