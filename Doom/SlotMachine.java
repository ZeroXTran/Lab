public class SlotMachine {
	private Slot slot1, slot2, slot3;
	
	public SlotMachine() {
		slot1 = new Slot();
		slot2 = new Slot();
		slot3 = new Slot();
	}
	
	public void spin() {
		slot1.spin();		
		slot2.spin();
		slot3.spin();
	}
	
	public String resultStr() {
		return String.format("|%d|%d|%d|", 
			slot1.getValue(), 
			slot2.getValue(), 
			slot3.getValue());
	}
	public int result() {
		if (slot1.equals(slot2) && slot3.equals(slot2))
			return 3;
		else if (slot1.equals(slot2)||slot3.equals(slot2))
			return 2;
		else return 0;
	}
	
	
	public boolean jackpot() {
		return slot1.equals(slot2) && slot1.equals(slot3);
	}
}