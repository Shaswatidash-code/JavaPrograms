package basicsprograms;

import java.util.HashMap;
import java.util.Map;

public class MapInterface_Coolection {

	public static void main(String[] args) {
		//upcasting
		Map m1 = new HashMap();
		//store the value in the form of Key and value
		m1.put("Aman", "SDET 1");
		m1.put("Pramila", "HR Associates");
		m1.put("Prashanth", "Sales Associates");
		m1.put("Bhum", "SEO Expert");
		m1.put("Ganesh", "Developer");
		System.out.println(m1);
	}

}
