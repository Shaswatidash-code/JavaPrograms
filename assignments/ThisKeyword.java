package assignments;

public class ThisKeyword 
{
	String name;
	int age;
	double salary;
	void student_details(String name, int age, double salary)
	{
		System.out.println("My name is --> "+name);
		System.out.println("My age is --> "+age);
		System.out.println("My salary is --> "+salary);
	}

	public static void main(String[] args)
	{
		ThisKeyword t1 = new ThisKeyword();
		t1.student_details("Surya", 47, 9000);
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.salary);
		
	}

}
