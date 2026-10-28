package LibraryMgmtSysMilestoneB;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello, World!");

		//Default constructor
		Member member1 = new Member();
		member1.setName("Arun");
		member1.setContactInfo("Salem");
		System.out.println("Member1: " + member1.getUserId() + ", " + member1.getName() + ", " + member1.getContactInfo());


		Member member2 = new Member("vimal", "chennai");
		System.out.println("Member2: " + member2.getUserId() + ", " + member2.getName() + ", " + member2.getContactInfo());

		//run time polymorphism, implementation based on the actual object:
		User user1 = new Member("John", "New York");
		User user2 = new Guest("Doe", "Los Angeles");

		user1.displayDashboard();
		user2.displayDashboard();

		System.out.println("Can user1 borrow books? " + user1.canBorrowBooks());
		System.out.println("Can user2 borrow books? " + user2.canBorrowBooks());


		Member member3 = new Member("Vishnu", "TVM", 4);
		member3.displayDashboard();
		System.out.println("Can member3 borrow books? " + member3.canBorrowBooks());


		Lendable lendable = new DummyLendable();

		System.out.println("**********************************************************************");

		System.out.println("Is Book Available :"+ lendable.isAvailable());

		lendable.lend(member3);

		System.out.println("Is Book Available :"+ lendable.isAvailable());

		lendable.returnBook(member3);

		System.out.println("Is Book Available :"+ lendable.isAvailable());


		System.out.println("**********************************************************************");

		PrintedBook printedBook1 = new PrintedBook();
		// 1. Test Default Constructor
		printedBook1.displayBookDetails();

		//2. Test Parameterized Constructor
		PrintedBook printedBook2 = new PrintedBook("1234567890", "Java Programming", "John Doe");
		printedBook2.displayBookDetails();

		//3. Test Copy constructor
		PrintedBook printedBook3 = new PrintedBook(printedBook2);
		printedBook3.displayBookDetails();

		System.out.println("****************** Text Book ****************************************************");

		TextBook textBook1 = new TextBook("Mathematics", 1, "9876543210", "Algebra Basics", "Jane Doe", true);
		textBook1.displayBookDetails();

		System.out.println("****************** Novel Book ****************************************************");
		NovelBook novelBook1 = new NovelBook("Fiction", "1234567890", "The Great Gatsby", "F. Scott Fitzgerald", true);
		novelBook1.displayBookDetails();




	}
}