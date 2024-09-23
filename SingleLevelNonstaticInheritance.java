package basicsprograms;
class Two{ //super class
	void add()
	{
		System.out.println("add");
	}
	void sub()
	{
		System.out.println( "sub");
	}
}
public class SingleLevelNonstaticInheritance extends Two {
	void mul()
	{
		System.out.println("mul");
	}
	void div()
	{
		System.out.println("div");
	}

	public static void main(String[] args) {
		SingleLevelNonstaticInheritance s1 = new SingleLevelNonstaticInheritance();
		s1.mul();
		s1.div();
		s1.add();
		s1.sub();
	}

}
