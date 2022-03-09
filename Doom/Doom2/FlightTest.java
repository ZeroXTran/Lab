
public class FlightTest {
	public static void main (String[] args) {
		Flight f1 = new Flight ("Delta Airline","Los Angeles", "Boston", 111 );
		Flight f2 = new Flight ("Indian Airlines","Alabama", "Mumbai", 402 );
		Flight f3 = new Flight ("Japan Airline","Texas", "Tokyo", 601);
		
		f1.setFlightNumber(160);
		f2.setFlightNumber(564);
		f3.setFlightNumber(879);
		
		System.out.println (f1);
		System.out.println (f2);
		System.out.println (f3);
		
		
		
		
 }
}
