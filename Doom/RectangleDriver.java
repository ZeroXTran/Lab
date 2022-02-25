
public class RectangleDriver {
	public static void main(String[] args) {
		Rectangle obj = new Rectangle(1,2);
		System.out.println(obj);
		
		System.out.println(obj.getLength());
		System.out.println(obj.getWidth());
		obj.setLength(5);
		obj.setWidth(5);
		System.out.println(obj.perimeter());
		System.out.println(obj.area());

	}

}
