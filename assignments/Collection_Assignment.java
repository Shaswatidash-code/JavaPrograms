package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_Assignment {

	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add(76);
		l1.add(7);
		l1.add(6);
		l1.add(760);
		l1.add(706);
		l1.add(607);
		l1.add(67);
		//accept null
		//l1.add(null);
		//indexing
		//order of insertion
		//duplicate-yes
		Collections.sort(l1);
		System.out.println(l1);
	}

}

//Assignment 68: WAP using sort