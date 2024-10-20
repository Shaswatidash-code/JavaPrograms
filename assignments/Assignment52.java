package assignments;
interface Animal1
{
	abstract void sound();
	abstract void eat();
	
}

class Doggie implements Animal1
{

	@Override
	public void sound() {
		System.out.println("Dog makes a sound Woof");
	}

	@Override
	public void eat() {
		System.out.println("Dog loves meat");
	}
	
}
public class Assignment52 {

	public static void main(String[] args) 
	{
	Animal1 a1 = new Doggie();
	a1.sound();
	a1.eat();
	}


}

//Assignment 52: Create class and inherit property of interface