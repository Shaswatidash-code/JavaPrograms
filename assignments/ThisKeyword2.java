package assignments;

public class ThisKeyword2 {
	String name;
	int age;
	double salary;
	void student_details(String name, int age, double salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
		//This is how you can update the value of Global variable with the help of the local variable
	}

	public static void main(String[] args)
	{
		ThisKeyword2 t1 = new ThisKeyword2();
		t1.student_details("Surya", 47, 9000);
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.salary);
		
	}
	

}

//Assignment 75: WAP using this keyword
