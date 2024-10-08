package basicsprograms;

public class GlobalVariable_Update {
	static int a = 100;
	int b = 90;

	public static void main(String[] args) {
		//Accessing the static variable
		System.out.println(a);
		
		//Accessing the non static Global Variable
		GlobalVariable_Update g1 = new GlobalVariable_Update();
		
		//To update the non static global variable inside static method
		g1.b = 7;
		System.out.println(g1.b);
		
	}

}
