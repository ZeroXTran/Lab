/*
 Dan Tran
 ITSE-1302-008
 3/2/2022
 PP 4.7
 Write a class called Book that contains instance data for the title, author, publisher, and copyright date.
*/
public class BookShelf {

	public static void main(String[] args) {
		Book b1 = new Book("Java Solution ","Dostoevsky","Pearson",1995); 
		Book b2 = new Book("Politics Suck! ","Bob Mcdaniel","Knopf",2020); 
		Book b3 = new Book("Russian Suck! ","Putin","Swaez",2020);
		
		b1.setCopyRightDate(1996);
		b2.setAuthor("Robert McDaniel");
	    System.out.println(b1);
	    System.out.println();
	    System.out.println(b2);
	    System.out.println();
	    System.out.println(b3);
	    
	    

	}

}
