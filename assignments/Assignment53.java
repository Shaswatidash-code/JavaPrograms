package assignments;
interface Vehicle
{
	abstract void start();
	abstract void stop();
}
abstract class Machine
{
	abstract void operate();
	
	void maintenance()
	{
		System.out.println("Perform maintenance on the machine");
	}
}

class Car extends Machine implements Vehicle
{

	@Override
	public void start() {
		System.out.println("car is starting");
	}

	@Override
	public void stop() {
		System.out.println("car is stopping");
		
	}

	@Override
	void operate() {
		System.out.println("car is in operation");
	}
	
}
public class Assignment53 {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.stop();
		c.operate();
		c.maintenance();
		
	}

}

//Assignment 53: WAP in which we are writing extends & implements keywords in a subclass