
public class Sphere {
	private double diameter;

	public Sphere(double diameter) {
		
		this.diameter = diameter;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public double volume() {
		return 4.0/3*Math.PI*Math.pow(diameter/2, 3);
	}
	public double surfaceArea() {
		return 4.0*Math.PI*Math.pow(diameter/2, 2);
	}
	public String toString() { 
		String s = String.format("%.3f",volume()); 
		String v = String.format("%.3f",surfaceArea());
		return "The volume of the sphere is "+s+
				" and the surface area of the sphere is "+v+".";
	}
}
