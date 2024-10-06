package basicsprograms;
abstract class Google_Auth
{
	abstract void login(); //abstract methods
	abstract void registration();
}

public class GroTechMinds extends Google_Auth 
{
	void login() 	
	{
		System.out.println("Login to the application");
	}

	void registration() 
	{
		System.out.println("Login and Register to the application");
	}
	public static void main(String[] args) {
		GroTechMinds g1 = new GroTechMinds();
		g1.login();
		g1.registration();
	}

}
//Assignment 22: WAP in which abstract class is present along with concrete class
