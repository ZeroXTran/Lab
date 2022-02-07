/*
 Dan Tran
 ITSE-1032-008
 2/7/2022
 Chapter 2 Quiz - First and last name input
 Create a code that input the that prompts the user for two integers.
*/
import java.util.*;


public class MathwithInt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 10,b = 20;
		System.out.println("Enter the two integers");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(1.0*a / b);
	}
	

}
