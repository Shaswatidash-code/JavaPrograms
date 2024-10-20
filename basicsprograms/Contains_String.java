package basicsprograms;

public class Contains_String {

	public static void main(String[] args) 
	{
		String input = "Manish Kumar Tiwari";
		String input1 = input.toLowerCase();
		
	    boolean b1 = input.contains("Tiwari");
		System.out.println(b1);
		
		boolean b2 = "Manish".equals("manish");
		System.out.println(b2);
		
	}

}
