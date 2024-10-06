package assignments;
class AssignClass2
{
	void food()
	{
		System.out.println("eat food");
	}
	void cook()
	{
		System.out.println("Cook food");
	}
}
abstract class AssignClass3 extends AssignClass2
{
	abstract void sleep();
	abstract void wakeUp();
	void walk()
	{
		System.out.println("walk everyday");
	}
	void run()
	{
		System.out.println("Run twice a week");
	}
}
public class AbstractAssignment extends AssignClass3 
{
	void click()
	{
		System.out.println("Click photo");
	}
	void dance()
	{
		System.out.println("dance everyday");
	}
	public static void main(String[] args) 
	{
		AbstractAssignment a1 = new AbstractAssignment();
		a1.click();
		a1.dance();
		a1.walk();
		a1.run();
		a1.food();
		a1.cook();
		a1.sleep();
		a1.wakeUp();
	}
	void sleep() {
		
	}
	void wakeUp() {
		
	}

	
		
	}

//Assignment 23: WAP in which super most class having 2CM, abstract class having 2AM&2CM, subclass having 2CM
