package assignments;

public class Typecasting_sample {

	public static void main(String[] args) 
	{
		//Widining
		//convert any int number into double number
		int a = 10;
		
		//Implicit syntax of widning
		//double d1 =  a;
		
		//Explicit syntax of widning
		double d1 = (double) a;
		System.out.println(d1);
		
		//narrowing
		//convert any double number into int number
		double a1 = 10.9;
		
		//Explicitly narrowing
		int i1 =  (int) a1;//explicit narrowing
		System.out.println(i1);
	}

}
//It is the implicit syntax