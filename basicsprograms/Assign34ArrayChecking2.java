package basicsprograms;

public class Assign34ArrayChecking2 {

	public static void main(String[] args) {
		int student[] = new int[4];
		student[0] = 74;
		student[1] = 96;
		student[2] = 72;
		student[3] = 50;
		
		int notocheck = 50;
		for(int i = 0;i<4;i++)
		//for(int i = 0;i<student.length;i++)
		{
			if(notocheck==student[i])
			{
				System.out.println(notocheck +" is a part of array at the index position" + i);
			}
		}
		
	}

}


//Assignment 34: WAP where the size of the array is 4, and check
//whether a given value (such as 50)is a part of the array or not.
