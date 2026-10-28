package Generics.User;

import java.util.ArrayList;
import java.util.List;

public class Client {

	static void main() {

		User user = new User("Vimal");

		Utility utility = new Utility();
		utility.printName(user);

		Student student = new Student("Arun");
		utility.printName(student);//see here utility can get the student obj as well, since student is the child of user class

		//But what if in this case, here list is the class that din extend any user class, so passing List interface wont work here
		Utility utility2 = new Utility();
		List<User> users = new ArrayList<>();
		User user1 = new User("Ram");
		User user2 = new User("Gokul");

		users.add(user1);
		users.add(user2);
		utility2.printNames(users);//this one works, but what if we passing the child

		Utility utility3 = new Utility();
		List<Student> students = new ArrayList<>();
		Student student1 = new Student("Kishore");
		Student student2 = new Student("Thulasi");

		students.add(student1);
		students.add(student2);
		//utility3.printNames(students);//It wont work,since here parent is List -> It expect Required type: User
		//to rectify this we can say to list like user and any of its child ->check utility class for the reference (eg: <? extends User> in params
		utility3.printNames(students);//this is called wild card
	}
}
