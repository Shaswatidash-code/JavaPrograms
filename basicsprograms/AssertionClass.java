package basicsprograms;

public class AssertionClass {

	public static void main(String[] args) 
	{
		int age = 17;
		//assert age>=18;
		assert age>=18:"Sorry but the age of the person is not as expected";
		System.out.println("The age of person is "+age);
		
	}

}