
public class Fork {
	private int numOfProngs;
	private String color;
	private String material;
	public Fork(int numOfProngs, String color, String material) {
		this.numOfProngs = numOfProngs;
		this.color = color;
		this.material = material;
	}
	public int getNumOfProngs() {
		return numOfProngs;
	}
	public void setNumOfProngs(int numOfProngs) {
		this.numOfProngs = numOfProngs;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Fork has " + numOfProngs + " Prongs, and the color is "+color+ " the material is "+material+"."; 
	}
	
	

}
