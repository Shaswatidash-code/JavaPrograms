package basicsprograms;

import java.util.Scanner;

public class Assign9AreaOfRectangle {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the length");
		double l = s1.nextDouble();
		System.out.println("Enter the base");
		double b = s1.nextDouble();
		double area = l*b;
		System.out.println("Area of rectangle is -->"+area);
	}

}

//Assignment 9: Find area of Rectangle using Scanner class