public class RollingDice2 {
	public static void main(String[] args) {
		PairOfDice pair1 = new PairOfDice();
		
		System.out.println(pair1);
		pair1.roll();
		pair1.setValue1(4);
		pair1.roll();
		System.out.println("\nDie 1 face value is " + pair1.getValue1());
		//pair1.setValue1(3);
		System.out.println("\nDie 2 face value is " + pair1.getValue2());
	}
}