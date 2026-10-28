package LibraryMgmtSysMilestoneB;

public class Member extends User {

	private int borrowedBooksCount;
	private static final int MAX_BORROW_LIMIT = 5;

	public Member()
	{
		super();
		this.borrowedBooksCount = 0;
	}

	public Member(String name, String contactInfo)
	{
		super(name, contactInfo);
		this.borrowedBooksCount = 0;
	}

	public Member(String name, String contactInfo, int borrowedBooksCount)
	{
		super(name, contactInfo);
		this.borrowedBooksCount = borrowedBooksCount;
	}

	public Member(User other)
	{
		super(other);
		this.borrowedBooksCount = 0;
	}

	public int getBorrowedBooksCount()
	{
		return borrowedBooksCount;
	}

	public void displayDashboard()
	{
		System.out.println("Member Dashboard: "+ "Books Borrowed "+ borrowedBooksCount);
	}

	public boolean canBorrowBooks()
	{
		return borrowedBooksCount < MAX_BORROW_LIMIT;
	}

}
