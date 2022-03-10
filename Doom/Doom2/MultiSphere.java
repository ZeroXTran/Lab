/*
 Dan Tran
 ITSE-1302-008
 3/7/2022
 PP 4.3
 Write a class called Sphere that contains instance data that represents the sphere’s diameter. 
*/
public class MultiSphere {

	public static void main(String[] args) {
		Sphere obj = new Sphere(20);
		Sphere obj2 = new Sphere(10);
		System.out.println(obj.toString());
		obj2.setDiameter(25);
		System.out.println(obj2.toString());
		obj.setDiameter(30);
		System.out.println(obj.toString());
		
	}
        
}
