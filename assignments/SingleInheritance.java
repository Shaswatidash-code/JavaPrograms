package assignments;

class Inheritance
{
	static void read()
	{
		System.out.println("read everyday");
	}
	static void write()
	{
		System.out.println("write everyday");
	}
}

public class SingleInheritance extends Inheritance
{
	static void draw()
	{
		System.out.println("paint once a week"); 
	}
	static void play()
	{
		System.out.println("play daily");
	}
	
	public static void main(String[] args) {
		draw();
		play();
		read();
		write();
		
	}

}

//Assignment 14: single level inheritance by using static methods
