package basicsprograms;

public class StringStringBufferStringBuilder {

	public static void main(String[] args) {
		//String a = "Automation";
		//System.out.println(a);
		
		//immutable
		String name = new String("Selenium");
		String name1 = name.concat(" testing");
		System.out.println(name1);
		
		//mutable
		StringBuffer s1 = new StringBuffer("Manish");
		s1.append(" Tiwari");
		System.out.println( s1);
		
		//mutable
		StringBuilder s2 = new StringBuilder("india");
		s2.append(" beautiful  country");
		System.out.println(s2);
	}

}
