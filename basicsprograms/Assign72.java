package basicsprograms;

import java.util.HashMap;
import java.util.Map;

public class Assign72 {

	public static void main(String[] args) {
		Map<String,Integer> m1 = new HashMap<String, Integer>();
		//employee name and their salary
		
		m1.put("Apple", 8532);
		m1.put("Banana", 9857);
		m1.put("Graps", 7487);
		System.out.println(m1.keySet());
		
	}

}

//Assignment 71: WAP using Map that stores the names of fruits and their quantities then perform actions: 
//i)retrieve & print fruit quantity
//ii)remove fruit
//iii)print all fruits with quantity