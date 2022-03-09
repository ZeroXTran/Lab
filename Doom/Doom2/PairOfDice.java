
public class PairOfDice {
	
		
		private Die die1;
		private Die die2;
		
		
		public PairOfDice() {
			die1 = new Die();
			die2 = new Die();
		}
		
		
		public int getValue1() {
			return die1.getFaceValue();
		}
		
		
		public void setValue1(int val) {
			die1.setFaceValue(val);
		}
		public int getValue2() {
			 return die2.getFaceValue();
			
		}
		public void setValue2(int val) {
			die2.setFaceValue(val);
		}
		
		
		public void roll() {
			die1.roll();
			die2.roll();
		}	
		
		public int sum() {
		return	die1.getFaceValue()+die2.getFaceValue();
			
			
		}
		
		
		public String toString() {
			return String.format("PairOfDice{ \n%s\n%s}", die1, die2);
		}
	}


