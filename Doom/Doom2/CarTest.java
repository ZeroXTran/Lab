/*
 Dan Tran
 ITSE-1302-008
 3/2/2022
 PP 4.5
 Write a class called Car that contains instance data that represents the make, model, and year of the car.
*/
public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car("M3","Telsa",2022);
		Car c2 = new Car("R8","Audi",2022);
		Car c3 = new Car("F-150","Ford",2022);
		
		c1.setMake("VW");
		c2.setMake("Mercedes");
		c2.setModel("GLB");
		
		System.out.println(c2);
		System.out.println();
		System.out.println(c1);
		System.out.println();
		System.out.println(c3);

	}

}
