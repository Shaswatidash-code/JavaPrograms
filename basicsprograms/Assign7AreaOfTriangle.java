package basicsprograms;

import java.util.Scanner;

public class Assign7AreaOfTriangle {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		double a = 0.5;
		System.out.println("Enter the value of base");
		double b = s1.nextDouble();
		
		System.out.println("Enter the value of height");
		double h = s1.nextDouble();
		
		double triangle =a*b*h;
		System.out.println("Area of triangle is--->" +triangle);
		
	}

}

//Assignment 7: Find area of Triangle using scanner class
