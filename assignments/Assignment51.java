package assignments;
interface SuperInterface
{
	abstract void method1();
	abstract void method2();
}

abstract class MainAbstract implements SuperInterface
{
	abstract void method3();
	abstract void method4();
	
	void method5()
	{
		System.out.println("Concrete method 1 from Absract class");
	}
	
	void method6()
	{
		System.out.println("Concrete method 2 from Abstract class");
	}
	
}

class Subclass extends MainAbstract
{

	@Override
	public void method1() {
		System.out.println("Implemented method 1 from super Interface");
	}

	@Override
	public void method2() {
		System.out.println("Implemented method 2 from Super interface");
	}

	@Override
	void method3() {
		System.out.println("Implemented method 3 from abstract class");
	}

	@Override
	void method4() {
		System.out.println("Implemented method 4 from abstract class");
	}
	void additionalme1()
	{
		System.out.println("Concrete method 1 in subclass");
	}
	void additionalme2()
	{
		System.out.println("Concrete method 2 in subclass");
	}
	
}
public class Assignment51 {

	public static void main(String[] args) {
		Subclass s1 = new Subclass();
		//Calling implemented methods
		s1.method1();
		s1.method2();
		s1.method3();
		s1.method4();
		
		//calling concrete methods
		s1.method5();
		s1.method6();
		s1.additionalme1();
		s1.additionalme2();
	}

}

//Assignment 51: WAP in which super most interface class having 2AM, abstract class having 2AM&2CM, subclass having 2CM