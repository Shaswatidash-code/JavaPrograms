package basicsprograms;

public class NestedIfElseConditionalStatment {

	public static void main(String[] args) {
		char gender1 = 'M';
		char gender2 = 'F';
		// int age = 40;
		// if(gender1 = 'F');
		int age = 10;
		if (gender1 == 'M') {
			if (age > 12) {
				System.out.println("Adult fare");
			} else {
				System.out.println("Half ticket");
			}
		} else {
			System.out.println("Its free for Female");
		}

	}

}
