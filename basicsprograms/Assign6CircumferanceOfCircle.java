package basicsprograms;

import java.util.Scanner;

public class Assign6CircumferanceOfCircle {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of PI");
		double pi = s1.nextDouble();
		System.out.println("Enter the value of RADIOUS");
		double r = s1.nextDouble();
		double circumference = 2*pi*r;
		System.out.println(circumference);
	}

}
//Assignment 6 - Find circumference of circle using Scanner class