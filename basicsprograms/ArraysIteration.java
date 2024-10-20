package basicsprograms;

import java.util.Arrays;

public class ArraysIteration {

	public static void main(String[] args) 
	{
		int array1[] = new int[4];
		array1[0] =75;
		array1[1] = 55;
		array1[2] =65;
		array1[3]=45;
		
		//you have to assign the values of array 1 to array 2, who will be on right hand side. (Array 1)
		int array2[] = new int[4];
		/*array2[0] =array1[0];
		array2[1] =array1[1];
		array2[2] =array1[2];
		array2[3] =array1[3];*/
		for(int i =0;i<array1.length;i++)
		{
			array2[i] = array1[i];
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
	}

}
