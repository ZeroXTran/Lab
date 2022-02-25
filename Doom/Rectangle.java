
public class Rectangle {
	private double length,width;
//constructor
	public Rectangle(double len, double wid) {
		
		length = len;
		width = wid;
	}
//getter
	public double getLength() {
		return length;
	}
//setter
	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	public double perimeter() {
		return 2*length+2*width;
	}
	public double area() {
		return length*width;
	}
	public String toString() {
	return "Rectangle has length "+length+" and width "+width;	
	}
	
}
