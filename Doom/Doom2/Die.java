
public class Die {
	
		public static final int MIN = 1, MAX = 6;
		
		
		private int faceValue;
		
		
		public Die() {
			faceValue = MIN;
		}
		
		
		public int getFaceValue() {
			return faceValue;
		}
		
		
		public void setFaceValue(int val) {
			
			if(val >= MIN && val <= MAX) {
				faceValue = val;
			}
		}
		
		public void roll() {
			
			faceValue = (int)(Math.random() * MAX) + MIN;
		}
		
		
		public String toString() {
			return String.format("Die {faceValue: %d}", faceValue);
		}
	}



