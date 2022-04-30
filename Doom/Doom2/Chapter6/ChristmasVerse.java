/*
Dan Tran
ITSE-1032-008
4/30/2022
PP 6.10
 Write a program that prints the verses of the song “The Twelve Days of Christmas,” in which each verse adds one line.
*/
public class ChristmasVerse {

	static void method(int n) {
		String day = "";
		switch(n) {
		case 1: day = "1st"; break;
		case 2: day = "2nd"; break;
		case 3: day = "3rd"; break;
		case 4: day = "4th"; break;
		case 5: day = "5th"; break;
		case 6: day = "6th"; break;
		case 7: day = "7th"; break;
		case 8: day = "8th"; break;
		case 9: day = "9th"; break;
		case 10: day = "10th"; break;
		case 11: day = "11th"; break;
		case 12: day = "12th"; break;
		
		
		}
		
		System.out.println("On the "+day+" day of Christmas, my true love gave to me");
		
		switch(n) {
		case 12: System.out.println("Twelve drummers drumming");
		case 11: System.out.println("Eleven pipers piping,");
		case 10: System.out.println("Ten lords a-leaping,");
		case 9: System.out.println("Nine ladies dancing,");
		case 8: System.out.println("Eight maids a-milking,");
		case 7: System.out.println("Seven swans a-swimming,");
		case 6: System.out.println("Six geese a-laying,");
		case 5: System.out.println("Five golden rings,");
		case 4: System.out.println("Four calling birds,");
		case 3: System.out.println("Three French hens,");
		case 2: System.out.println("Two turtle doves, and");
		case 1: System.out.println("A partridge in a pear tree.");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		
     for (int day =1; day<=12;day++)
    	 method(day);
     System.out.println();
	}

}
