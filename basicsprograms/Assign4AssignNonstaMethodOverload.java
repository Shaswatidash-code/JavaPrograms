package basicsprograms;

public class Assign4AssignNonstaMethodOverload {
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
		Assign4AssignNonstaMethodOverload asm = new Assign4AssignNonstaMethodOverload();
		asm.addition(2.0, 4.9);
		asm.addition(100, 190);
		asm.addition(30, 20.5);
		asm.addition(50.8, 20);
		
	}

}

//Operators with non static method by using method overloading concepts- Assignment 4
