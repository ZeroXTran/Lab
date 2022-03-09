
public class Flight {
	private String airline, origin, destination;
	private int flightNumber;
	public Flight(String airline, String origin, String destination, int flightNumber) {
		
		this.airline = airline;
		this.origin = origin;
		this.destination = destination;
		this.flightNumber = flightNumber;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String toString ()
	{
	return airline + ", " + flightNumber + "  From: " + origin +", To: " + destination;
	}
	
	

}
