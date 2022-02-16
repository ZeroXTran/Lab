/*
 Dan Tran
 ITSE-1032-008
 2/16/2022
 Quiz Chapter 3
 Create a code that input your first name and last name and then created a user that is based on  the named 
*/

import java.util.Scanner;

public class Username {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName, lastName;
		
		
		System.out.print("Enter your first name: ");
		 firstName = scan.nextLine();
		 System.out.println();
		 System.out.print("Enter your last name: ");
		 lastName = scan.nextLine();
		 System.out.println();
		 String userName = firstName.toLowerCase().substring(0,1)+ lastName.toLowerCase().substring(0,4);
		 
		
		 System.out.println("The user name generated for you is "+ userName);	 
	}
	
}
