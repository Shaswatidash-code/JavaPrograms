package basicsprograms;

import java.util.Arrays;

public class Array_3 {

	public static void main(String[] args) {
		//int rollno[] = new int[4];
		int rollno[] = new int[-4];
		rollno[0] = 78;
		//update the value of a array.
		rollno[0] = 94;
		rollno[1] = 7;
		rollno[2] = 71;
		rollno[3] = 6;
		
		System.out.println(Arrays.toString(rollno));
	}

}

//Program 28: WAP where you get Negative array size exception