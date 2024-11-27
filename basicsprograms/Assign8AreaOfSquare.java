package basicsprograms;

import java.util.Scanner;

public class Assign8AreaOfSquare {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the area");
		double a = s1.nextDouble();
		double area = a*a;
		System.out.println("Area of square is--->"+area);
	}

}

//Assignment 8: Find area of square using Scanner class