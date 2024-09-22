package basicsprograms;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of PI");
		double pi = s1.nextDouble();
		System.out.println("Enter the value of Radious");
		double r = s1.nextDouble();
		double area = pi*r*r;
		System.out.println(area);
		
	}

}
