package basicsprograms;

public class Assgn49 {
	public static void main(String[] args) {
		

	String name = "RAM";
	
	//First output
	for(int i =0;i<name.length();i++)
	{
		System.out.println(name.charAt(i));
	}
	
	//Blank line between the two output
	System.out.println();
	
	//Second output
	for(int i = name.length()-1;i>=0;i--)
	{
		System.out.println(name.charAt(i));
	}
	
	}

}

//Assignment 49:
/*WAP where the your name is like "RAM" and print the output like:
R
A
M
And Print the second output as like:
M
A
R*/