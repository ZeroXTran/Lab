/*
 Dan Tran
 ITSE-1032-008
 4/18/2022
 PP 5.1
 Write a program that reads an integer value from the user representing a year.
*/
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		 int year;
		 Scanner scan = new Scanner (System.in);
         
		 
		 System.out.print ("Enter the year here: ");
	     year = scan.nextInt();
	     
	     if (year<1582)
	    	 System.out.println("This is not the valid year!");
	     else if( isLeapYear(year)) {
	    	 System.out.println("This is a leap year!");
	     }
	     else System.out.println("This is not a leap year!");
	}
	public static boolean isLeapYear(int year)
	{
		return year%400==0||(year%4==0&&year%100!=0);
		
	}
}

