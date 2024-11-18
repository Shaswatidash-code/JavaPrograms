package basicsprograms;

import java.util.HashMap;
import java.util.Map;

public class Assign70 {

	public static void main(String[] args) {
		Map<String,Integer> m1 = new HashMap<String, Integer>();
		//employee name and their salary
		
		m1.put("Mapple", 8532);
		m1.put("Tinu", 9857);
		m1.put("Black", 7487);
		
		//In the below line the value will print in a single line you cant be able to do iteration
		System.out.println(m1.keySet());
		for(String s1: m1.keySet())
		{
			System.out.println(s1);
		}
		
		System.out.println(m1.values());
		for(Integer i1: m1.values())
		{
			System.out.println(i1);
		}
	}

}

//Assignment 70: WAP using the Map interface and iterate over its entries using for loop 