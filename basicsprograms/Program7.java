package basicsprograms;

public class Program7 {

	public static void main(String[] args) {
		//String a1 = "ram's bank balance is 89765 INR";
		String a1 = "My home is near to sector 2 Patna 4";
		String a3 = a1.replaceAll("[0-9]", "");
		System.out.println(a3);
	}

}

//Assignment 43: WAP from the given string input replace all the entire numerics with Nothing.

//Example: String name= "My home is near to sector 2 Patna 4";