package basicsprograms;

import java.util.Arrays;

public class WrapperClass {
	static int count_of_alphabets;
	static int count_of_numeric;
	static int count_of_space;
	public static void main(String[] args) {
		String input = "kv no 2 bangalore !@";
		char c1[]= input.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		for(int i = 0;i<input.length();i++)
		{
			boolean b1 = Character.isAlphabetic(c1[i]);
			//System.out.println(b1);
			if(b1==true)
			{
				count_of_alphabets++;
			}
			boolean b2 = Character.isDigit(c1[i]);
			if(b2==true)
			{
				count_of_numeric++;
			}
			boolean b3 = Character.isWhitespace(c1[i]);
			if(b3==true)
			{
				count_of_space++;
			}
		}
		System.out.println("The count of alphabets is--> "+count_of_alphabets);
		System.out.println("The count of numbers is--> "+count_of_numeric);
		System.out.println("The count of spaces is--> "+count_of_space);
		
		int count_of_special=input.length()-(count_of_alphabets+count_of_numeric+count_of_space);
		System.out.println("Number of special character is -->"+count_of_special);
		
			}
	}


//Assignment 36: WAP to find out the alphabates char, digits, spaces, and special char from the given strings.