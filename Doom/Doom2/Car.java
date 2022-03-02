
public class Car {
	private String model, make;
	private int year;
	
	
	public Car(String model, String make, int year) {
		
		this.model = model;
		this.make = make;
		this.year = year;
	}
	
   public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

public String toString() {
	   return "The make of the car is "+make+", the model of the Car is "+model+". The year it was made is "+year+".";
   }
}
