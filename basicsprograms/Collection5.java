package basicsprograms;

import java.util.HashSet;
import java.util.Set;

public class Collection5 {

	public static void main(String[] args)
	{
		Set s1 = new HashSet();
		s1.add(54);
		s1.add(75);
		s1.add(96);
		s1.add(12);
		s1.add("MKT");
		s1.add('x');
		s1.add(56);
		s1.add(56);
		s1.add(null);
		s1.add(11);
		s1.add(16);
		s1.add("Moon");
		s1.add("Sun");
		System.out.println(s1);
		
	}

}

//Assignment 67: WAP to utilize add method from Set Interface
