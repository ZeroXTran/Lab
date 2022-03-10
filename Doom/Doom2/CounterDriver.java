/*
 Dan Tran
 ITSE-1302-008
 3/2/2022
 PP 4.1
 Write a class called Counter that represents a simple tally counter, which might be used to count people as they enter a room.
*/
public class CounterDriver {
	public static void main(String[] args) {
		Counter obj = new Counter();
		obj.click();
		obj.reset();
		obj.click();
		obj.click();
		obj.click();
		
		System.out.println(obj.getCount());
		System.out.println(obj.toString());
		
	}

}
