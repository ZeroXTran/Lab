/*
 Dan Tran
 ITSE-1302-008
 4/20/2022
 PP 5.6 Use the coin class to determine two coin object to see who coin flip head 3 in row.
*/
public class FlipRace {

	public static void main(String[] args) {
		Coin coin1 = new Coin();
		Coin coin2 = new Coin();

		int totalFlip = 0;
		int count1 = 0;
		int count2 = 0;

		while (count1 != 3 && count2 != 3) {
			coin1.flip();
			coin2.flip();
			totalFlip += 2;
			if (coin1.isHeads()) {
				count1++;
				System.out.print("Coin1 flip heads ");

			} else {
				count1 = 0;
				System.out.print("Coin1 flip tails ");
			}
			if (coin2.isHeads()) {
				count2++;
				System.out.println("Coin2 flip heads");
			}

			else {
				count2 = 0;
				System.out.println("Coin2 flip tails");
			}
			if (count1 == 3 && count2 != 3)
				System.out.println("Coin1 wins! # of flips " + totalFlip);
			if (count2 == 3 && count1 != 3)
				System.out.println("Coin2 wins! # of flips " + totalFlip);

			if (count2 == 3 && count1 == 3)
				System.out.println("Both coins tie! # of flips " + totalFlip);

		}

	}

}
