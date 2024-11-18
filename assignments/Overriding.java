package assignments;
/*class Math2
{
	void add()
	{
		System.out.println("Super class");
	}
}
*/
class Math1 //extends Math2
{
	void add()
	{
		System.out.println("Super class");
	}
}
public class Overriding extends Math1
{
	void add()
	{
		System.out.println("Sub class");
	}
	public static void main(String[] args) {
		Overriding m1 = new Overriding();
		m1.add();
		Math1 m2=new Math1();
		m2.add();
		
	}

}

//Assignment 20: WAP on Method Overriding
