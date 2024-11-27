package basicsprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assign71 {

	public static void main(String[] args) {
		//up casted from HashMap to Map
		Map<String,Integer> m1 = new HashMap<String, Integer>();
		//stores the name of fruits and the quantity
		m1.put("Apple", 85);
		m1.put("Banana", 98);
		m1.put("Graps", 74);
		m1.put("Orange", 100);
		//System.out.println(m1);
		//print fruit name
		for(String s1:    m1.keySet())
		{
			System.out.println(s1);
		}
		//print fruit qty in line by line
		for(Integer i1: m1.values())
		{
			System.out.println(i1);
		}
		//Print all fruits with QTY
		for(Entry<String, Integer> i2 : m1.entrySet())
		{
			System.out.println(i2);
		}
		//remove fruit
		String fruitToRemove = "Banana";
		m1.remove(fruitToRemove);
		System.out.println(m1);
		
		
	}

}

//Assignment 71: WAP using Map that stores the names of fruits and their quantities then perform actions: 
//i)retrieve & print fruit quantity
//ii)remove fruit
//iii)print all fruits with quantity