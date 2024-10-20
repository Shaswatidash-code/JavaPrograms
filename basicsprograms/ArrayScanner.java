package basicsprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		int rollno[] = new int[4];
		Scanner s1 = new Scanner(System.in);
		for(int i = 0;i<4;i++)
		{
			rollno[i] = s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));

		
	}

}

//Assignment 33: WAP to accept the array at runtime
/*rollno[0] = s1.nextInt();
rollno[1] = s1.nextInt();
rollno[2] = s1.nextInt();
rollno[3] = s1.nextInt();*/
//Every time the value comes from nextInt, need to store*/