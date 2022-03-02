
public class CounterDriver {
	public static void main(String[] args) {
		Counter obj = new Counter();
		obj.click();
		obj.reset();
		obj.click();
		obj.click();
		obj.click();
		
		System.out.println(obj.getCount());
		System.out.println(obj.toString());
		
	}

}
