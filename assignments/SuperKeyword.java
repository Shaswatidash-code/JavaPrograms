package assignments;
class Exercise
{
	void run()
	{
		System.out.println("run everyday");
	}
}
class Diet extends Exercise
{
	void run()
	{
		super.run();
		System.out.println("diet everyday");
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		Diet d1 = new Diet();
		d1.run();
	}

}

//Assignment 21: WAP on Method Overriding using super keyword in java