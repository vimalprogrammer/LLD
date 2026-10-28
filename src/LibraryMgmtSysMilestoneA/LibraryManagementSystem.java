package LibraryMgmtSysMilestoneA;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

	private static final List<Book> bookInventory = new ArrayList<>();
	private static final List<User> registeredUsers = new ArrayList<>();

	public static List<Book> getBookInventory() {
		return new ArrayList<>(bookInventory);
	}

	public static List<User> getRegisteredUsers()
	{
		return new ArrayList<>(registeredUsers);
	}

	public void addBook(Book book)
	{
		bookInventory.add(book);
	}

	public void registerUser(User user)
	{
		registeredUsers.add(user);
	}

	public void displayBooks()
	{
		for(Book book: bookInventory)
		{
			System.out.println("ISBN: " + book.getIsbn() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
		}
	}

	public void displayUsers()
	{
		for(User user: registeredUsers)
		{
			System.out.println("User ID: " + user.getUserId() + ", Name: " + user.getName());
		}
	}

	public static List<Book> searchBooks(String criteria)
	{
		List<Book> result = new ArrayList<>();
		for(Book book: bookInventory)
		{
			if(book.getIsbn().equals(criteria) || book.getTitle().equals(criteria) || book.getAuthor().equals(criteria))
			{
				result.add(book);
			}
		}
		return result;
	}

	public static List<Book> searchBooks(String criteria, BookType type)
	{
		List<Book> result = new ArrayList<>();

		for(Book book: bookInventory)
		{
			boolean matchesCriteria = (book.getIsbn().equals(criteria) || book.getTitle().equals(criteria) || book.getAuthor().equals(criteria));

			if(matchesCriteria)
			{
				if((type.equals(BookType.TEXTBOOK) || type.equals(BookType.NOVELBOOK)) && (book instanceof TextBook || book instanceof NovelBook))
				{
					result.add(book);
				}
			}
		}
		return result;
	}

	public enum BookType
	{
		TEXTBOOK,
		NOVELBOOK
	}



}
