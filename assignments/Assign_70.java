package assignments;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assign_70 {

	public static void main(String[] args) 
	{
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		//Fruit name and price
		m1.put("Apple", 110);
		m1.put("Orange", 200);
		m1.put("Graphs", 80);
		for(Entry<String,Integer> i1: m1.entrySet())
		{
			System.out.println(i1);
		}
	}
	

}

//Assignment - 70WAP using the Map interface and iterate over its entries using for loop 
