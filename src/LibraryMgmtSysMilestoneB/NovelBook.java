package LibraryMgmtSysMilestoneB;

public class NovelBook extends Book {

	private String genre;
	private String isbn;
	private String title;
	private String author;
	private boolean isAvailable;

	public NovelBook(String genre, String isbn, String title, String author, boolean isAvailable) {
		super(isbn, title, author);
		this.genre = genre;
		this.isAvailable = isAvailable;
	}

	@Override
	void displayBookDetails() {
		System.out.println("Novel Book Details");
		System.out.println("Genre: " + genre);
		System.out.println("ISBN: " + getIsbn());
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + getAuthor());
		System.out.println("Available: " + isAvailable);
	}


}
