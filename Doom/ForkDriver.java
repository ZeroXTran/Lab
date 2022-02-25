
public class ForkDriver {
	public static void main(String[] args) {
		Fork obj = new Fork(3,"sliver","copper");
		System.out.println(obj);
		System.out.println(obj.getColor());
		System.out.println(obj.getMaterial());
		System.out.println(obj.getNumOfProngs());
		
		obj.setColor("Yellow");
		obj.setMaterial("Iron");
		obj.setNumOfProngs(4);
		
		System.out.println(obj);
} 

}
