package LibraryMgmtSysMilestoneB;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

	private List<Book> bookInventory = new ArrayList<>();
	private List<User> registeredUsers = new ArrayList<>();

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
			System.out.println(book);
		}
	}

	public void displayUsers()
	{
		for(User user: registeredUsers)
		{
			System.out.println(user);
		}
	}

}
