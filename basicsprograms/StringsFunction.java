package basicsprograms;

public class StringsFunction {

	public static void main(String[] args) 
	{
		String a ="Automation";
		int l1=a.length();
		System.out.println(l1);
		//length of the String
		
		System.out.println(a.toUpperCase());
		//convert the given string to lower case
		System.out.println(a.toLowerCase());
		//convert the given string to upper case
		
		char c1 = a.charAt(5);
		System.out.println(c1);
		//which character I have at the indexing position 5.
		
		String b = " Testing";
		System.out.println(a.concat(b));
		System.out.println(a.concat(" Engineer"));
		//it means a combine with b
		
		String c = " automation testing by mkt ";
		System.out.println(c);
		System.out.println(c.trim());
		
		System.out.println(c.isEmpty());
		
		
	}

}
