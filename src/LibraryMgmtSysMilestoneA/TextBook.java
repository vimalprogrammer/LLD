package LibraryMgmtSysMilestoneA;

public class TextBook extends Book{

	private String isbn;
	private String title;
	private String author;

	TextBook()
	{
		super();
	}

	TextBook(String isbn, String title, String author)
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





}
