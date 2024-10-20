package basicsprograms;

import java.util.Date;

public class Current_Time {

	public static void main(String[] args) {
		//get the current time
		Date d1 = new Date();
		long l1 = d1.getTime();
		System.out.println(l1);
		
		//we can get the current time in an another way
		Date d2 = new Date(d1.getTime() + (1000*60*60*24*1));
		System.out.println(d2);
		//This will given you the human understandable time in the reading format
		
		//month
		String d3 = d2.toString();
		String month = d3.substring(4, 7);
		System.out.println(month);
		
		//year
		String year = d3.substring(d3.length()-4);
		System.out.println(year);
		
		//date
		String date = d3.substring(8, 10);
		System.out.println(date);
		
	    String dateformat1 = date.concat("-").concat(month).concat("-").concat(year);
	    System.out.println(dateformat1);
	    
	    String dateformat2 = date.concat("/").concat(month).concat("/").concat(year);
	    System.out.println(dateformat2);
		
		//In India the date format is concat with month and year
	    
	    //If you want to get future time you will do some addition
	    
		
		
	}

}

//Assignment 50: WAP to find the current  date and time.
