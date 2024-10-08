package basicsprograms;

class SingleNonInheritance
{
	void dance()
	{
		System.out.println("dance on music");
	}
}
public class SingleInNon extends SingleNonInheritance
{
	void sing()
	{
		System.out.println("sing a song"); 
	}

	public static void main(String[] args) 
	{
		SingleInNon s1 = new SingleInNon();
		s1.sing();
		s1.dance();
	}

}


//Assignment 15: Single level inheritance by using non static methods