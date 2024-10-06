package basicsprograms;
class Parent_Class
{
	void login()
	{
		System.out.println("Login with email id");
	}
	
}
public class Child_Class extends Parent_Class
{
	void login()
	{
		System.out.println("Login with mobile no");
		super.login();
	}

	public static void main(String[] args) {
		Child_Class c1 = new Child_Class();
		c1.login();
		
	}

}
