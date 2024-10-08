package basicsprograms;

public class AssignOperaTorNonStatic {
	void addition() {
		int a = 100;
		int b = 200;
		int sum = a + b;
		System.out.println("The addition of two numbers " + sum);
	}

	void substraction() {
		int a = 100;
		int b = 200;
		int sub = b - a;
		System.out.println("The substraction of two numbers " + sub);
	}

	void multiplication() {
		int a = 100;
		int b = 200;
		int mul = a * b;
		System.out.println("The multiplication of two numbers " + mul);
	}

	void division() {
		int a = 100;
		int b = 20;
		int div = a / b;
		System.out.println("The division of two numbers " + div);
	}

	void modulus() {
		int a = 102;
		int b = 20;
		int mod = a % b;
		System.out.println("The modulus of two numbers " + mod);
	}

	public static void main(String[] args) {
		AssignOperaTorNonStatic at = new AssignOperaTorNonStatic();
		at.addition();
		at.substraction();
		at.multiplication();
		at.division();
		at.modulus();
	}

}

//Operators using non static method-Assignment 2
