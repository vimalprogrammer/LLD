package LibraryMgmtSysMilestoneA;

public class NovelBook extends Book{

	private String isbn;
	private String title;
	private String author;

	NovelBook()
	{
		super();
	}

	NovelBook(String isbn, String title, String author)
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
