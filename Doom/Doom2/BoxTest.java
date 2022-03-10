/*
 Dan Tran
 ITSE-1302-008
 3/2/2022
 PP 4.6
 Write a class called Box that contains instance data that represents the height, width, and depth of the box.
*/

public class BoxTest {

	public static void main(String[] args) {
		Box box1 = new Box(2.05,2.05,0.05);
		Box box2 = new Box(3.06,0.08,1.54);
		Box box3 = new Box(0.05,2.06,2.09);
		
	    box3.setWidth(2.55);
	    box2.setDepth(3.54);
	    box1.setHeight(2.66);
		
	    System.out.println(box1);
	    System.out.println(box2);
	    System.out.println(box3);
	}

}
