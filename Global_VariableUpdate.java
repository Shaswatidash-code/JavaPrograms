package basicsprograms;

public class Global_VariableUpdate {
	static int a =100;
	int b =  100;
	static String name;
	static boolean answer;

	public static void main(String[] args) {
		int c = 90;//Local variable
		name= "Manish";
		answer=true;
		System.out.println(c+a);
		System.out.println(name);
		System.out.println(answer);
		
		
	}

}
