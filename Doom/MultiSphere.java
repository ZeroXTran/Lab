
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
