package basicsprograms;

import java.util.Iterator;

public class Printing1to100 {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			if(i==99)
			{
				continue;
			}
			System.out.println(i);
		}
		
	}

}