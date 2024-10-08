package basicsprograms;

public class StaticandNonstaticMethod {
	static void addition()
	{
		System.out.println("Addition");
	}
	void substraction()
	{
		System.out.println("Substraction");
	}

	public static void main(String[] args) {
		addition();
		StaticandNonstaticMethod s1=new StaticandNonstaticMethod();
		s1.substraction();
	}

}
 