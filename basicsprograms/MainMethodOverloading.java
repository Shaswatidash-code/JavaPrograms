package basicsprograms;

public class MainMethodOverloading {

	public static void main(String[] args) 
	{
		System.out.println("main method");
		MainMethodOverloading c1 = new MainMethodOverloading();
		c1.main();
		main("Ramu",'M');
	}
	public void main()
	{
		System.out.println("Main method with no arguments");
	}
	public static void main(String name, char gender)
	{
		System.out.println("main method with argument as String and gender");
	}

}
