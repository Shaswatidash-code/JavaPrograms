package basicsprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assign69 {

	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<>();
        m1.put("A", 10);
        m1.put("B", 20);
        m1.put("C", 30);
        System.out.println(m1.keySet());
     // Get an iterator for the entrySet of the map
        Iterator<Map.Entry<String, Integer>> iterator = m1.entrySet().iterator();

        // Iterate over the map entries using the iterator and a while loop
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
	}

}
//Assignment 69: WAP using the Map interface and iterate over its entries using an Iterator with a while loop.
