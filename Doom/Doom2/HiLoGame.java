
public class HiLoGame {
	private int randomNum;
	private int numberOfGuesses;
	public HiLoGame() {
		reset();
	}
	public void reset() {
		randomNum = (int)(Math.random()*100+1);
		numberOfGuesses= 0;
	}
	
	public int getRandomNum() {
		return randomNum;
	}
	public int getNumberOfGuesses() {
		return numberOfGuesses;
	}
	public int guess(int num) {
		++numberOfGuesses;
		return randomNum-num;
	}
	public static void main(String[] args) {
		HiLoGame obj = new HiLoGame();
		System.out.println(obj.randomNum);
		System.out.println(obj.guess(70));
		
	}
}
