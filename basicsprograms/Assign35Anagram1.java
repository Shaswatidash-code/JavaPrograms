package basicsprograms;

import java.util.Arrays;

public class Assign35Anagram1 {

	public static void main(String[] args) {
		String s1="cafe";
		String s2="face";
		if(s1.length()!=s2.length())
		{
			System.out.println("they are not anagram");
		}
		else
		{
			
		char c1[] = s1.toCharArray();
		char c2[] = s1.toCharArray();
		//sorting
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		//Compare
		boolean b1 = Arrays.equals(c1, c2);
		if(b1==true)
		{
			System.out.println("They are anagram");
		}
		else
		{
			System.out.println("They are not anagram");
		}	
	}
  }

}

//Assignment 35: WAP to check the given two Strings are anagram or not.
