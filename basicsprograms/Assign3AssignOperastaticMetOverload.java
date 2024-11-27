package basicsprograms;

public class Assign3AssignOperastaticMetOverload {
	static void addition(double a, double b) {
		double sum = a + b;
		System.out.println(sum);
	}

	static void addition(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	static void addition(int a, double b) {
		double sum = a + b;
		System.out.println(sum);
	}

	static void addition(double a, int b) {
		double sum = a + b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		addition(6.90, 9.98);
		addition(30, 9);
		addition(30, 4.90);
		addition(2.30, 4.50);

	}

}

//Operators with static method by using method overloading concepts-Assignment 3
