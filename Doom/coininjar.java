
/*
 Dan Tran
 ITSE-1032-008
 2/9/2022
 P.P 2.10
 Create a code that input the the time duration depending.
*/
import java.util.Scanner;

public class coininjar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float quarters;
		float dimes;
		float nickels;
		float pennys;

		System.out.println("Enter how much quarters: ");
		quarters = scan.nextFloat();
		System.out.println("Enter how much dimes: ");
		dimes = scan.nextFloat();
		System.out.println("Enter how much nickels: ");
		nickels = scan.nextFloat();
		System.out.println("Enter how much pennys: ");
		pennys = scan.nextFloat();
		
		float totalCent;
		totalCent = (float) ((0.25 * quarters) + (0.10 * dimes) + ( 0.05 * nickels)+  ( 0.01 * pennys));
		
		System.out.printf("$%.2f total in the jar!",totalCent);
	}

}