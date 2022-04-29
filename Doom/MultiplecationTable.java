
/*
Dan Tran
ITSE-1032-008
4/25/2022
PP 6.3
Write a program that produces a multiplication table, showing the results of multiplying the integers 1 through 12 by themselves.
*/
public class MultiplicationTable {

	public static void main(String[] args) {
		
		for (int a=1;a<85;a++){
			System.out.printf("-");
		}
		System.out.println();
		for (int i =1;i<=12;i++) {
			for (int j=1;j<=12;j++) {
				System.out.printf(" %4d |", (i*j) ); //System.out.printf("%4d|", i*j)
			}
			System.out.println();

		}
		for (int a=1;a<85;a++){
			System.out.printf("-");
		}
	}

}
