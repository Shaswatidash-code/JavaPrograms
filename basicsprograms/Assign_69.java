package basicsprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Assign_69 {

	public static void main(String[] args) 
	{
		Map<String,Integer> m1 = new HashMap<String, Integer>();
		//Employee name and age
		m1.put("test1", 24);
		m1.put("test2", 30);
		m1.put("test3", 20);
		m1.put("test4", 35);
		Iterator <Entry <String, Integer>> i1 = m1.entrySet().iterator();
		System.out.println("using iterator");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}


//Assignment 69: WAP using the Map interface and iterate over its
//entries using an Iterator with a while loop.