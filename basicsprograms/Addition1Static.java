package basicsprograms;

public class Addition1Static {
	static void addition()
	{
		int a = 100;
		int b = 200;
		int sum = a+b;
		System.out.println("The addition of two number is-->"+sum);
	}
	static void substraction()
	{
		int a = 100;
		int b = 200;
		int sub = b-a;
		System.out.println("The substraction of two number is-->"+sub);
	}
	static void multiplication()
	{
		int a = 100;
		int b = 200;
		int mul = a*b;
		System.out.println("The multiplication of two number is-->"+mul);
	}
	static void division()
	{
		int a = 100;
		int b = 20;
		int div = a/b;
		System.out.println("The division of two number is-->"+div);
	}
	static void modulus()
	{
		int a = 102;
		int b = 20;
		int mod = a%b;
		System.out.println("The remainder of two number is-->"+mod);
	}

	public static void main(String[] args) {
		addition();
		substraction();
		multiplication();
		division();
		modulus()
;		
	}

}
