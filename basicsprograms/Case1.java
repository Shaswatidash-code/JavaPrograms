package basicsprograms;

public class Case1 
{
	public void add()
	{
		System.out.println("Add numbers");
	}
	private void sub()
	{
		System.out.println("Substract numbers");
	}
	void mul()
	{
		System.out.println("multiply numbers");
	}
	protected void div()
	{
		System.out.println("divide numbers");
	}
	

	public static void main(String[] args) {
		Case1 c1=new Case1();
		c1.div();
		c1.mul();
		c1.sub();
		c1.add();
		
	}

}

//Assignment 54: WAP to access the 4 access specifiers within the same class
