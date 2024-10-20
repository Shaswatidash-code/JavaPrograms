package assignments;

public class Array_Assignment {

	public static void main(String[] args) {
		String name = "Manish";
		
		// Convert string to character array using toCharArray()
		char[] charArray = name.toCharArray();
		//System.out.println(charArray);
		
		
		//print the character array using a for loop
		System.out.println("character array:");
		for (int i = 0; i < charArray.length; i++) {
        System.out.print(charArray[i] + " ");
		
		}

	}
}

//Assignment 59: WAP to convert any String into Array