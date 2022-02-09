
/*
 Dan Tran
 ITSE-1032-008
 2/9/2022
 P.P 2.9
 Create a code that input the the time duration depending.
*/
import java.util.Scanner;

public class timeduration {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int seconds;
		int hours;
		int minutes;

		System.out.println("Enter the hours: ");
		hours = scan.nextInt();// The number of hours
		System.out.println("Enter the mintues:");
		minutes = scan.nextInt();// The number of hours
		System.out.println("Enter the seconds:");
		seconds = scan.nextInt();// The number of seconds

		int totalSeconds;
		totalSeconds = (3600 * hours) + (60 * minutes) + (1 * seconds);

		System.out.println(totalSeconds + " seconds total! ");
	}

}
