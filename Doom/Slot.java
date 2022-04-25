public class Slot {
	private int value;
	
	public int getValue() {
		return value;
	}
	
	public void spin() {
		value = (int)(Math.random() * 10);
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Slot) {
			return this.value == ((Slot)obj).value;
		}
		return false;
	}
}