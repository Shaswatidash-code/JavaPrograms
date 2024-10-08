package basicsprograms;

import java.util.Scanner;

public class ScannerGlobalArithmetic {
	static int a;
	static int b;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		int add = a+b;
		int sub = a-b;
		int mul= a*b;
		int div = a/b;
		int mod = a%b;
		System.out.println("Sum of a & b:--->" +add);
		System.out.println("Sub of a & b:--->" +sub);
		System.out.println("Mul of a & b:--->" +mul);
		System.out.println("Div of a & b:--->" +div);
		System.out.println("Mod of a & b:--->" +mod);
		
		
		
	}

}
