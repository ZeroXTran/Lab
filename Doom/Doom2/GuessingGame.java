
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		HiLoGame obj = new HiLoGame();
		System.out.println(obj.getRandomNum());
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Guess a number 1 to 100, you can quit anytime by pressing -1.");
		int check = scan.nextInt();
		int playAgain = 1;
		while (playAgain == 1) {
		while (check>=1) {
			int diff = obj.guess(check);
			System.out.println("diff " + diff);
			if (diff==0) {
				System.out.println("You have guessed correctly!");
				System.out.println("You used " +obj.getNumberOfGuesses()+" guesses");
				check = -1;
			}
			else {
				if(diff<0) { 
				System.out.println("You guess too high try again!");
				
			}
			else {
				System.out.println("You guess too low try again!");
			}
				System.out.println("If want to keep playing enter a another guess, and enter -1 to give up.");	
				check = scan.nextInt();
			}
			
		}
		System.out.println("Enter 1 to play again , enter 2 to quit.");
		playAgain = scan.nextInt();
		if (playAgain==1) {
			  obj= new HiLoGame();	
		System.out.println("Guess a number 1 to 100, you can quit anytime by pressing -1.");
		check = scan.nextInt();
		}
		}
		System.out.println("Thank you for playing my awesome game!");

	}
	
}