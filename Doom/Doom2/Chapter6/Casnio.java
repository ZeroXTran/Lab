import java.util.Scanner;



public class Casnio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userPlayer = ("Bob");
		System.out.println("If want to play press 1 or press \"Stop\" to stop trying your luck");
		userPlayer = scan.nextLine();
		SlotMachine obj = new SlotMachine();
		
		
		while(!userPlayer.equals("Stop")) {
			obj.spin();
			System.out.println(obj.resultStr());
			if (obj.result()==3)
				System.out.println("You hit the Jackpot");
			else if ((obj.result()==2))
				System.out.println("Too bad try again!");
			else 
				System.out.println("Damn your luck suck!");
				
			
			
			
			System.out.println("If want to play again press 1 or press \"Stop\" to stop trying your luck");
			userPlayer = scan.nextLine();
		}

	}

}
