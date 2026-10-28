package LibraryMgmtSysMilestoneB;

public abstract class User {

	private String userId;
	private String name;
	private String contactInfo;
	private static int idCounter = 0;

	public User()
	{
		this.userId = generateUniqueId();
	}

	public User(String name, String contactInfo)
	{
		this.userId = generateUniqueId();
		this.name = name;
		this.contactInfo = contactInfo;
	}

	public User(String userId, String name, String contactInfo)
	{
		this.userId = generateUniqueId();
		this.name = name;
		this.contactInfo = contactInfo;
	}

	//copy constructor
	public User(User other)
	{
		this.userId = generateUniqueId();
		this.name = other.name;
		this.contactInfo = other.contactInfo;
	}

	public String getUserId()
	{
		return userId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getContactInfo()
	{
		return contactInfo;
	}

	public void setContactInfo(String contactInfo)
	{
		this.contactInfo = contactInfo;
	}

	public final String generateUniqueId()
	{
		return String.valueOf(++idCounter);
	}

	public abstract void displayDashboard();

	protected abstract boolean canBorrowBooks();

	static int totalUsers;

	static int getTotalUsers()
	{
		return totalUsers;
	}

}
