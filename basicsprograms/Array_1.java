package basicsprograms;

import java.util.Arrays;

public class Array_1 {

	public static void main(String[] args) 
	{
		int rollno[] = new int[4];
		rollno[0]=78;
		rollno[1]=7;
		rollno[2]=71;
		rollno[3]=6;
		
		/*System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);
		System.out.println(rollno[3]);*/
		
		/*for(int i = 0;i<=3;i++)
		{
			System.out.println(rollno[i]);
		}*/
		System.out.println(Arrays.toString(rollno));
		
		String name[]= new String[3];
		name[0] = "ram";
		name[1] = "sahu";
		name[2] = "pooja";
		rollno[3]=6;
		/*for(int i = 0;i<=3;i++)
		{
			System.out.println(name[i]);
		}*/
		System.out.println(Arrays.toString(name));
	}

}

//Assignment 27: WAP where you get an ArrayIndexOutOfBoundException
