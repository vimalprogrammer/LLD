package LibraryMgmtSysMilestoneB;

class Librarian extends User {

	private String employeeNumber;

	public void displayDashboard()
	{
		System.out.println("Librarian Dashboard " + "Employee Number: " + employeeNumber);
	}

	public boolean canBorrowBooks()
	{
		return true;
	}

	void addNewBook(Book book)
	{

	}

	void removeBook(Book book)
	{

	}


}
