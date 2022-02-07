/*
 Dan Tran
 ITSE-1032-008
 2/7/2022
 P.P 2.4
 Create a code that input the My Life.
*/
import java.util.Scanner;

public class PP24 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter your name");
    	String name = scan.nextLine();
    	System.out.println("Enter your age");
    	int age = scan.nextInt();
    	scan.nextLine();
    	System.out.println("Enter your college name");
    	String college = scan.nextLine();
    	System.out.println("Enter your pet name");
    	String petName = scan.nextLine();
    	System.out.println("Hello, my name is "+name+" and I am "+age+" years old. I’m enjoying my time at "+college+", "
    			+ "though I miss my pet "+petName+" very much!");
    	
		
    	 
 
        
   }


}





