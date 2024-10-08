package basicsprograms;

import java.util.Scanner;

public class IfElseScannerConditional {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Age of the person");
		int ageofperson = s1.nextInt();
		
		if(ageofperson>=18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			System.out.println("You are not eligible to vote");
		}
	}

}
