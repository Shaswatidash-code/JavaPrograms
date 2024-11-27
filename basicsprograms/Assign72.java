package basicsprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assign72 {

	public static void main(String[] args) {
		//up casted from HashMap to Map
				Map<String,Integer> m1 = new HashMap<String, Integer>();
				//stores the student roll no and the name
				m1.put("Mahesh", 8);
				m1.put("Preety", 1);
				m1.put("Sugar", 30);
				m1.put("Cane", 20);
				
				//Print all fruits with QTY
				for(Entry<String, Integer> i2 : m1.entrySet())
				{
					System.out.println(i2);
				}
				
				
				
			}

		
	}

//Assignment 72: WAP using Map to store student roll numbers and their names then perform actions: 
//i)Check if specific roll no and name exist in map & print if exists
