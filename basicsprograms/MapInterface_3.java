package basicsprograms;

import java.util.HashMap;
import java.util.Map;

public class MapInterface_3 {

	public static void main(String[] args) {
		Map<String,Integer> m1 = new HashMap<String, Integer>();
		//employee name and their salary
		
		m1.put("Rashmi", 8532);
		m1.put("Meenu", 9857);
		m1.put("Blake", 7487);
		m1.put("Shantanu", 8541);
		m1.put("Shekhar", 7496);
		
		//replace the salary with Meenu
		m1.replace("Meenu", 9874);
		System.out.println(m1);
		m1.replace("Shekhar", 7496, 8521);
		System.out.println(m1);
		
		m1.remove("Blake");
		System.out.println(m1);
		m1.remove("Meenu", 9874);
		System.out.println(m1);
	}

}
