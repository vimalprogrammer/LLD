package inheritance;

public class Client {

    public static void main(String[] args) {
//        Student s = new Student("ABC",23,87);
        //System.out.println(s.age);
//        User u = new User("ABC",23);
        Student s = new Student("XYZ",24,98);
        s.hello();
        User u = new Student("ABC",23,87);
        u.login();
      //  u.hello(); // not allowed

        doSomethingForUser(new Student());
        doSomethingForUser(new Instrcutor());
    }

    public static void doSomethingForUser(User u) {
        u.login();
    }
}
