/*
 Dan Tran
 ITSE-1032-008
 2/9/2022
 P.P 2.7
 Create a code that input the miles to kilometers.
*/
import java.util.Scanner;

public class speedtotime{
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int kilometer;
    	double speed;
    	double travelTime;
    	 System.out.println ("Enter the distance travelled:");
    	 kilometer = scan.nextInt();
    	 System.out.println ("Enter the speed of the travel:");
    	 speed = scan.nextDouble();
    	 travelTime = kilometer / speed;
    	 System.out.println ("Time required for trip: " + travelTime + " hours.");
    	 
    	 
    	 
    	
    	
   }


}