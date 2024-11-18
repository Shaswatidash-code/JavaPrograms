package basicsprograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface2 {

	public static void main(String[] args) 
	{
		Map<String,Integer> m1 = new HashMap<String, Integer>();
		//employee name and their salary
		
		m1.put("Rashmi", 8532);
		m1.put("Meenu", 9857);
		m1.put("Blake", 7487);
		m1.put("Shantanu", 8541);
		m1.put("Shekhar", 7496);
		//In the below line the value will print in a single line you cant be able to do iteration
		System.out.println(m1.keySet());
		
		//It will print all the keys
		
		//how to iterate keys
		//printing all the values one by one
		for(String s1: m1.keySet())
		{
			System.out.println(s1);
		}
		
		System.out.println(m1.values());
		for(Integer i1: m1.values())
		{
			System.out.println(i1);
		}
		
		//with the help of below iteration can able to print both keys and values
		for(Entry<String,Integer> i2: m1.entrySet())
		{
			System.out.println(i2);
		}
		
		//This is the another way to do iteration in the case of
		//map interface where you will be able to iterate it's keys and values
		Iterator <Entry <String, Integer>> i3 = m1.entrySet().iterator();
		System.out.println("Using iterator");
		while(i3.hasNext())
		{
			System.out.println(i3.next());
		}
			
	}

}
