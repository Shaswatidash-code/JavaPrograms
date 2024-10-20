package basicsprograms;

public class ReverseString {

	public static void main(String[] args) 
	{
		String input = "abcd";
		String output = "";
		
	/*	input.charAt(3);
		input.charAt(2);
		input.charAt(1);
		input.charAt(0); */
		for(int i = 3;i>=0;i--)
		{
			char c1 = input.charAt(i);
			output = output+c1;
		}
		System.out.println(output);
		
	}

}

//Assignment - 25- WAP on Reverse a String