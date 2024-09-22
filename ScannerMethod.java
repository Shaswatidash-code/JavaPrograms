package basicsprograms;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String FirstName = s1.next();
		
		System.out.println("Are you graduate?");
		Boolean b1 = s1.nextBoolean();
		s1.close();
		
	}

}
