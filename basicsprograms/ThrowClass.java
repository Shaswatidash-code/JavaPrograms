package basicsprograms;

import java.util.Scanner;

public class ThrowClass {

	public static void main(String[] args) throws NullPointerException{
		Scanner s2 = new Scanner(System.in);
		int age = s2.nextInt();
		if(1>2)
		{
			throw new NullPointerException("the cell is empty");
			
		}
		else
		{
			throw new ArithmeticException();
		}
		//throw new NullPointerException("the cell is empty");
	}

}
