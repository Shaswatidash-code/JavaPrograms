package basicsprograms;

public class MethodOverloading2 {
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
	static void addition(int a, double b)
	{
		double sum = a+b;
		System.out.println( sum);
	}
	static void addition(double a, int b)
	{
		double sum = a+b;
		System.out.println(sum);
	}
	static void addition(boolean b, String c, char d)
	{
		System.out.println("My name is "+c);
		System.out.println(b);
		System.out.println(d);
	}
	void addition()
	{
		int a = 100;
		int b = 200;
		int sum = a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		addition(true,"Abishek",'N');
		MethodOverloading2 md2=new MethodOverloading2();
		md2.addition(3.21, 9.85);
		md2.addition(78, 22);
		addition(78,63.254);
		addition(5.32,64);
		
	}

}
