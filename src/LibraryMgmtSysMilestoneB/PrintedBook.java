package LibraryMgmtSysMilestoneB;

public class PrintedBook extends Book {

	public PrintedBook()
	{
		super();
	}
	public PrintedBook(String isbn,String title, String author)
	{
		super(isbn, title, author);
	}

	public PrintedBook(PrintedBook other)
	{
		super(other.getIsbn(), other.getTitle(), other.getAuthor());
	}

	public void displayBookDetails()
	{
		System.out.println("Printed Book Details:");
		System.out.println("ISBN: " + getIsbn());
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + getAuthor());
		System.out.println("Availability: " + (isAvailable() ? "Available" : "Not Available"));
	}
}
