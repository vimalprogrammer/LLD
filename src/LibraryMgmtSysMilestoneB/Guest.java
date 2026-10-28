package LibraryMgmtSysMilestoneB;

public class Guest extends User {


	public Guest()
	{
		super();
	}

	public Guest(String name, String contactInfo)
	{
		super(name, contactInfo);
	}

	public Guest(User other)
	{
		super(other);
	}

	public void displayDashboard()
	{
		System.out.println("Guest Dashboard");
	}

	public boolean canBorrowBooks()
	{
		return false;
	}
}
