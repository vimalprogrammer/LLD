package LibraryMgmtSysMilestoneB;

public class TextBook extends Book {

	private String subject;
	private int edition;
	private String isbn;
	private String title;
	private String author;
	private boolean isAvailable;


	TextBook(String subject, int edition, String isbn, String title, String author, boolean isAvailable)
	{
		super(isbn,title,author);
		this.subject = subject;
		this.edition = edition;
		this.isAvailable = isAvailable;
	}

	public void displayBookDetails()
	{
		System.out.println("Text Book Details");
		System.out.println("Subject: " + subject);
		System.out.println("Edition: " + edition);
		System.out.println("ISBN: " + getIsbn());
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + getAuthor());
		System.out.println("Available: " + isAvailable);
	}

}
