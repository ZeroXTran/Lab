/*
 Dan Tran
 ITSE-1302-008
 3/7/2022
 PP 4.4
 Write a class called Dog that contains instance data that represents the dog’s name and age. 
*/
public class Kennel {

	public static void main(String[] args) {
		 Dog dog1 = new Dog(1,"Doge");
		  Dog dog2 = new Dog(2,"Billy");
		  Dog dog3 = new Dog(5,"Silly");
		  
		  dog1.setDogAge(9);
		  System.out.println(dog1);
		  
		  dog2.setDogName("Azzam");
		  System.out.println(dog2);
		  
		  System.out.println(dog3);
		  
		  System.out.println();
		  System.out.println("Dog's years in person "
		  		+ "and years:");
		  System.out.println(dog1.getDogName()+ ": "+dog1.computeDogAge());
		  System.out.println(dog2.getDogName()+ ": "+dog2.computeDogAge());
		  System.out.println(dog3.getDogName()+ ": "+dog3.computeDogAge());

	}

}
