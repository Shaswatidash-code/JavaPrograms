package basicsprograms;
public class ThrowKeyword {
	static void add()
	{
		throw new ArithmeticException();
	}

	public static void main(String[] args) {
		//throw new NullPointerException();
		//or
		add();
		//throw new NullPointerException("This cell is empty");
	}

}
