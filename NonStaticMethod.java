package basicsprograms;

public class NonStaticMethod 
{
	void addition()
	{
		System.out.println("Adding 2 numbers");
	}
	void substraction()
	{
		System.out.println("Substracting 2 numbers");
	}
	

	public static void main(String[] args) {
		NonStaticMethod n1 = new NonStaticMethod();
		n1.addition();
		n1.substraction();
		System.out.println("My Main Method");

	}

}
