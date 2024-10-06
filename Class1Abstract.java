package basicsprograms;
abstract class Class3Abstract
{
	abstract void method1();//abstract method
	abstract void method2();
	void method4()//Concrete method
	{
		System.out.println("Logic for logout from system");
	}
	
}

abstract class Class2Abstract extends Class3Abstract
{
	abstract void method3();
	abstract void method5();
}
public class Class1Abstract extends Class2Abstract
{
	
	public static void main(String[] args) //concrete method
	{
		Class1Abstract c1 = new Class1Abstract();
		c1.method3();
		c1.method5();
		c1.method1();
		c1.method2();
		c1.method4();
		
	}

	void method3() 
	{
		
	}

	void method5() 
	{
		
	}

	void method1() 
	{
		
	}

	void method2() 
	{
		
	}

}

//WAP  in which super most class having 2
