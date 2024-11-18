package assignments;

public class Assign78Narrowing {

	public static void main(String[] args)
	{
		//long l1 = 304748364867868686978L;
		long l1 = -2147483648L;
		double d1 = (double) l1;
		System.out.println(d1);
		
	}

}

//Assignment 78: WAP to convert double to long (narrowing)