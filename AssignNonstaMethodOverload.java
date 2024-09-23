package basicsprograms;

public class AssignNonstaMethodOverload {
	void addition(double a, double b)
	{
		double sum = a+b;
		System.out.println(sum);
	}
	void addition(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	void addition(int a, double b)
	{
		double sum = a+b;
		System.out.println(sum);
	}
	void addition(double a, int b)
	{
		double sum = a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		AssignNonstaMethodOverload asm = new AssignNonstaMethodOverload();
		asm.addition(2.0, 4.9);
		asm.addition(100, 190);
		asm.addition(30, 20.5);
		asm.addition(50.8, 20);
		
	}

}

//Operators with non static method by using method overloading concepts- Assignment 4
