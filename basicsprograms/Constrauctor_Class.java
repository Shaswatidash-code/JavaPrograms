package basicsprograms;

public class Constrauctor_Class {
	Constrauctor_Class()
	{
		System.out.println("1st");
	}
	Constrauctor_Class(int a)
	{
		System.out.println("2nd");
	}
	Constrauctor_Class(int a,int b)
	{
		System.out.println("3rd");
	}

	public static void main(String[] args) {
		Constrauctor_Class c1 =new Constrauctor_Class();
		new Constrauctor_Class(500);
		new Constrauctor_Class(500,1000);
	}

}
