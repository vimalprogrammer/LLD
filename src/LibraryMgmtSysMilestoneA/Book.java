package LibraryMgmtSysMilestoneA;

public class Book {

	private String isbn;
	private String title;
	private String author;

	Book()
	{
	}

	Book(String isbn, String title, String author)
	{
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}

	public String getIsbn()
	{
		return isbn;
	}

	public String getTitle()
	{
		return title;
	}

	public String getAuthor()
	{
		return author;
	}

	public void displayBookDetails()
	{
		System.out.println("ISBN: " + getIsbn());
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + getAuthor());
	}

}
