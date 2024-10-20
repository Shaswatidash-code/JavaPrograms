package basicsprograms;

import java.util.Enumeration;
import java.util.Vector;

public class PropertiesVector {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(true);
		v.add(1);
		v.add(1.8);
		v.add("Avinash Kumar");
		v.add('k');
		v.add(null);
		v.add(1);
		v.add("");
		v.add(5,"9");
		
		Enumeration e1 = v.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
	}

}
