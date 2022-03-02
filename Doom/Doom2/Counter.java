
public class Counter {
	private int count;
	public Counter() {
		count = 0;
		
	}
  public void click() {
	  count++;
  }
  public int getCount() {
	  return count; 
  }
  public void reset() {
	  count = 0;
  }
  public String toString() {
	  return "The count is "+count;
  }
}
