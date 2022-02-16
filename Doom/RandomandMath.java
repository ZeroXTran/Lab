/*
 Dan Tran
 ITSE-1032-008
 2/16/2022
 Quiz Chapter 3
 Create a code that input your first name and last name and then created a user that is based on  the named 
*/

import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class RandomandMath {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your the minimum value for a random range: ");
	    int min = scan.nextInt();
	    System.out.println("Enter your the maximum value for a random range: ");
	    int max = scan.nextInt();
	    Random rand = new Random(); 
	    int choice = rand.nextInt(13)+3;
	    System.out.println("The random number selected is "+ choice);
		System.out.println(choice + " squared is "+Math.pow(choice,2));
		System.out.println(choice + " squared is "+Math.pow(choice,3));
		System.out.println( "The square root of "+choice+" is "+Math.sqrt(choice));
 }
}