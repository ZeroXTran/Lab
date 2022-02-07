/*
 Dan Tran
 ITSE-1032-008
 2/7/2022
 Chapter 2 Quiz - First and last name input
 Create a code that input the first and last name.
*/
import java.util.Scanner;

public class Nameinput {
    public static void main(String[] args) {
        String firstName, lastName;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        firstName = scan.nextLine();
        System.out.print("Enter your last name: ");
        lastName = scan.nextLine();
        System.out.println(firstName + " " + lastName);
        		
        
   }


}
