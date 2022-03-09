
public class Dog {
	
	private int dogAge;
	private String dogName;
	public Dog(int dogAge, String dogName) {
		this.dogAge = dogAge;
		this.dogName = dogName;
	}
	public int getDogAge() {
		return dogAge;
	}
	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}
	public String getDogName() {
		return dogName;
	}
	public void setDogName(String dogName) {
		this.dogName = dogName;
	} 
   public int computeDogAge() {
	   return dogAge = dogAge*7;
	      
   }
   public String toString() {
	     return "Dog's name: "+dogName + "\t" +  "Dog's age: " +dogAge ;
	                     
   }

}
