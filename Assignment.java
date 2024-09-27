package assignments;

class Animal
{
	Animal()
	{
		System.out.println("Animal World");
	}
	
}
class Dog extends Animal
{
	Dog(String a, int b)
	{
		System.out.println("Bog Barks");
	}
}
class Cat extends Dog
{
	Cat(int a, double b, char g)
	{
		super("Dog",8);
		System.out.println("Cat Meous");
	}
	
}
public class Assignment {

	public static void main(String[] args) 
	{
		new Cat(10,0.09,'C');
		
	}

}

//Assignment 17: WAP on parameterized and non parameterized super calling statement 
//(within multiple classes)
