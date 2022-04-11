
/*
 Dan Tran
 ITSE-1032-008
 4/11/2022
 Quiz Chapter 5
 write a program that prints out the Chinese zodiac when the user enters a year in the range of 1924-2031.
*/
import java.util.Scanner;

public class ChineseZodiac {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;

		System.out.print("Please enter a year (1924-2031): ");
		year = scan.nextInt();

		System.out.printf("You entered %d.\n", year);

		if (year >= 1924 && year <= 2031) {
			// Determine zodiac
			System.out.printf("Your Chinese zodiac is a %s!\n", getZodiac(year));
		} else {
			System.out.println("The year must be in the range of 1924-2031");
		}
	}


	public static String getZodiac(int year) {
		int zodiacNum = (year - 1924) % 12;

		if (zodiacNum == 0) 
			return "Rat";
		 else if (zodiacNum == 1) 
			return "Ox";
		 else if (zodiacNum == 2) 
			return "Tiger";
		 else if (zodiacNum == 3) 
			return "Rabbit";
		 else if (zodiacNum == 4) 
			return "Dragon";
		 else if (zodiacNum == 5) 
			return "Snake";
		 else if (zodiacNum == 6) 
			return "Horse";
		 else if (zodiacNum == 7) 
		    return "Goat";
		 else if (zodiacNum == 8) 
			return "Monkey";
		 else if (zodiacNum == 9) 
			return "Rooster";
		 else if (zodiacNum == 10) 
			return "Dog";
		 else
			return "Pig";
		 
	}
}