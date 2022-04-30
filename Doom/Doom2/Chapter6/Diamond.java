/*
Dan Tran
ITSE-1032-008
4/30/2022
PP 6.7
 Create modified versions of the Stars program to print the following patterns. Create a separate program to produce each pattern.
*/

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("What char do you want to print?");
		String str = scan.next();
		int height = 0;
		while (true) {
			System.out.println("How many lines tall should the diamond shape be 3-100?");
			height = scan.nextInt();
			if (height >= 3 && height <= 100)
				break;
			System.out.println("Wrong height try again! ");
		}
		String line = str;
		String space = "";
		for (int a = 0; a < height / 2+1; a++)
			space = "  " + space;

		System.out.println(space + line);
		for (int i = 0; i < height / 2 ; i++) {
			if (space.length() > 0)
				space = space.substring(1);
			line = str + line + str;
			System.out.println(space + line);

		}
		//if(height%2==0)
			//space =" ";
		//else
			//space = "";
		for (int i = 0; i < height / 2; i++) {
			line = line.substring(2);
			space = space+" ";
			System.out.println(space + line);
		}
		
	}

}
