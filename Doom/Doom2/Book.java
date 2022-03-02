
public class Book {
	private String titles, author, publisher;
	private int copyRightDate;
	public Book(String titles, String author, String publisher, int copyRightDate) {
	
		this.titles = titles;
		this.author = author;
		this.publisher = publisher;
		this.copyRightDate = copyRightDate;
	}
	public String getTitles() {
		return titles;
	}
	public void setTitles(String titles) {
		this.titles = titles;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getCopyRightDate() {
		return copyRightDate;
	}
	public void setCopyRightDate(int copyRightDate) {
		this.copyRightDate = copyRightDate;
	}
   public String toString() {
	   return "The title of the book is "+titles+", the author of the book is "+author+"\n the publisher is "+publisher+" "
	   		+ "and the the copyright date is "+copyRightDate+".";
   }
}
