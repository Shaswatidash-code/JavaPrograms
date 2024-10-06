package basicsprograms;
interface Amazon2
{
	void add();
}
interface Flipkart
{
	void subtract();
}


public class Learning_Interface2 implements Amazon2,Flipkart
{
	public static void main(String[] args) {
		
	}

	public void subtract() 
	{
		System.out.println("Hidden logic");
		
	}

	public void add() 
	{
		System.out.println("Hidden logic");
		
	}

}

//Assignment 24: WAP on multiple level inheritance using interface
