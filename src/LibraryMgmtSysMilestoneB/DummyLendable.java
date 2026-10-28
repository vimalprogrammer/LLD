package LibraryMgmtSysMilestoneB;

public class DummyLendable implements Lendable {

	private boolean available = true;

	public boolean lend(User user)
	{
		if(isAvailable())
		{
			System.out.println("Book lent to user: " + user.getName());
			available = false;
			return true;
		}
		System.out.println("Book Not Available");
		return false;
	}

	public void returnBook(User user)
	{
		available = true;
		System.out.println("Book returned by user: " + user.getName());
	}

	public boolean isAvailable()
	{
		return available;
	}




}
