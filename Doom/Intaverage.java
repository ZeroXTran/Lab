/*
 Dan Tran
 ITSE-1032-008
 2/7/2022
 P.P 2.2
 Create a code that input the three integer to print the average.
*/
import java.util.Scanner;

public class Intaverage {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	final int AVERAGE_NUM = 3 ;
    	System.out.println("Enter the three ints: ");
    	int a = scan.nextInt();
    	int b = scan.nextInt();
    	int c = scan.nextInt();
    	System.out.printf("%.2f",1.0*(a+b+c)/AVERAGE_NUM);
        
   }


}


