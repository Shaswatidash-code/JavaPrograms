package assignments;

public class ExceptionHandling {

	public static void main(String[] args) {
		try
		{
		//int c = 1/1;
		int c=1/0;
		System.out.println(c);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("I have handeled the exception");
		}
		
	}

}
