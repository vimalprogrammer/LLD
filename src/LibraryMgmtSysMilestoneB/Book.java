package LibraryMgmtSysMilestoneB;

public abstract class Book implements Lendable {

	private String isbn;
	private String title;
	private String author;
	private boolean isAvailable = true;

	public Book()
	{
		isAvailable = true;
	}

	public Book(String isbn,String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.isAvailable=true;
	}

	//copy constructor
	public Book(Book other) {
		this.isbn = other.isbn;
		this.title = other.title;
		this.author = other.author;
		this.isAvailable = other.isAvailable;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public boolean lend(User user) {
		if(isAvailable())
		{
			System.out.println("isAvailable :"+ isAvailable);
			isAvailable = false;
			System.out.println("Book borrowed by: "+ user.getName());
			return true;
		}
		System.out.println("Book is not available.");
		return false;
	}

	public void returnBook(User user) {
		// Implementation for returning the book
		System.out.println("Book returned by user: "+ user.getName());
		isAvailable = true;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	abstract void displayBookDetails();
}
