package basicsprograms;

import java.util.Arrays;

public class Array_Duplicatevalue {
public static void main(String[] args) 
{
	int[] no = new int[4];
	no[0]=8;
	no[1]=88;
	no[2]=888;
	no[3]=888;
	System.out.println(Arrays.toString(no));
	String[] empname = new String[4];
	empname[0] = "John";
	empname[1] = "Neha";
	empname[2] = "Robert";
	empname[3] = "John";//duplicate value
	System.out.println(Arrays.toString(empname));
	
}
}

//Assignment 29: WAP to check whether the array accepts duplicate value or not