package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch2 {

	public static void main(String[] args)
	{
		try
		{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value of array size");
		int size = s1.nextInt();
		int[] rollno = new int[size];
		rollno[0]=78;
		rollno[1]=97;
		rollno[2]=96;
		}
		catch(NegativeArraySizeException a1)
		{
			System.out.println("The Array size can only be positive numeric value, please enter correct value");
		
			Scanner s1 = new Scanner(System.in);
			int size = s1.nextInt();
			int[] rollno = new int[size];
		}
		
		catch(ArrayIndexOutOfBoundsException a2)
		{
			System.out.println("Your size of your array is less, please increse it");
		
			Scanner s2 = new Scanner(System.in);
			int size = s2.nextInt();
			int[] rollno = new int[size];
	
		}
		catch(InputMismatchException a3)
		{
			System.out.println("The Array size should only be positive numeric value, please enter correct value ");
		
			Scanner s3 = new Scanner(System.in);
			int size = s3.nextInt();
			int[] rollno = new int[size];
	
		}
		finally
		{
			System.out.println("close the connection with data base");
		}
}
}

//Assignment 73: Wap to handle the exception using try and multiple  catch methods

