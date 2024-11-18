package assignments;
class Parent_Class_Scanner extends Object
//This is how we can create multi level inheritance
{
	void add()
	{
		
	}
	
}

public class Classtypecast extends Parent_Class_Scanner
{
	

	public static void main(String[] args) 
	{
		Parent_Class_Scanner p1 = new Classtypecast();
		//implicit way of up casting
		
		
		Parent_Class_Scanner p2 = (Parent_Class_Scanner) new Classtypecast();
		//explicit way of up casting
		
		
	}

}
