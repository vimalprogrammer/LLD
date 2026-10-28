package LibraryMgmtSysMilestoneA;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();

		Book book = new Book("123","science","vimal");

		User user = new User("Gokul", "Chennai") {
			@Override
			public void displayDashboard() {

			}

			@Override
			protected boolean canBorrowBooks() {
				return false;
			}
		};

		libraryManagementSystem.addBook(book);
		libraryManagementSystem.registerUser(user);

		libraryManagementSystem.displayBooks();
		libraryManagementSystem.displayUsers();

		libraryManagementSystem.addBook(new NovelBook("111","harry potter","JK Rowling"));
		libraryManagementSystem.addBook(new NovelBook("112","300 spartans","JK Rowling"));
		libraryManagementSystem.addBook(new TextBook("222","Physics","Thomas Alva Edition"));
		libraryManagementSystem.addBook(new TextBook("333","Chemistry","John Doe"));
		//search book by author
		List<Book> result = LibraryManagementSystem.searchBooks("JK Rowling", LibraryManagementSystem.BookType.NOVELBOOK);
		System.out.println("Search Books by Auhtor: ");
		for(Book book1: result)
		{
			System.out.println("ISBN: " + book1.getIsbn() + ", Title: " + book1.getTitle() + ", Author: " + book1.getAuthor());
		}
		//search books by isbn
		List<Book> resultByIsbn = LibraryManagementSystem.searchBooks("333", LibraryManagementSystem.BookType.TEXTBOOK);
		System.out.println("Search Books by ISBN: ");
		for(Book book1: resultByIsbn)
		{
			System.out.println("ISBN: " + book1.getIsbn() + ", Title: " + book1.getTitle() + ", Author: " + book1.getAuthor());
		}

		Member member1 = new Member("Ram","Karur");
		Member member2 = new Member("Sonali","africa");
		Librarian librarian1 = new Librarian("admin1","USA");
		Librarian librarian2 = new Librarian("admin2","UK");

		libraryManagementSystem.registerUser(member1);
		libraryManagementSystem.registerUser(member2);
		libraryManagementSystem.registerUser(librarian1);
		libraryManagementSystem.registerUser(librarian2);


		// Display all books
		System.out.println("===== BOOK INVENTORY =====");

		for (Book book2 : LibraryManagementSystem.getBookInventory()) {
			book2.displayBookDetails();
			System.out.println("--------------------------");
		}

		//Display all users
		System.out.println("===== REGISTERED USERS =====");

		for(User user1: LibraryManagementSystem.getRegisteredUsers())
		{
			System.out.println("UserId: "+user1.getUserId());
			System.out.println("Name: "+user1.getName());
			System.out.println("--------------------------");
		}

	}

}
