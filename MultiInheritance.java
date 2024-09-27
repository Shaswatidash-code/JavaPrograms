package assignments;

class Grandparent
{
	void nature()
	{
		System.out.println("inherit the nature of ancestor");
	}
}
class Parent extends Grandparent
{
	void generation()
	{
		System.out.println("inherit the nature of Grandparent");
	}
	
}

public class MultiInheritance extends Parent{
	static void generationGap()
	{
		System.out.println("inherit the nature of parent");
	}

	public static void main(String[] args) {
		System.out.println("Order of generation");
		generationGap();
		MultiInheritance m1 = new MultiInheritance();
		m1.generation();
		m1.nature();
		
	}

}

//Assignment 16: Multilevel Inheritance by using static and non static methods
//by using 4 classes.
