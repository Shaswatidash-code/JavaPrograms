package assignments;

public class CalculateSwitchCase {
	static double num1 = 20;
	static double num2 = 10;
	
	//The variable choice determines which operation to perform (1 for addition, 2 for subtraction, etc.). 
	//You can change this value to test different operations.
	int choice;

	public static void main(String[] args) {
		switch(3)
		{
		case 1:System.out.println("Additing "+(num1 + num2));
		break;
		case 2: System.out.println("Substrating "+(num1 - num2));
		}
		
	}

}

//Assignment 58: WAP to perform add,sub,multi,div using same 2 variables in switch case