package basicsprograms;

public class MathThreadClass {

	public static void main(String[] args) throws InterruptedException {
		for(int i = 1;i<=100;i++)
		{
			System.out.println(Math.random());
			Thread.sleep(1000);
		}
	}

}

//Assignment 13: WAP on Thread class.(Thread.sleep)
