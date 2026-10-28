package polymorphism;

public class Student extends User{

    int age = 20;

    public void random() {
        System.out.println("Random");
    }

    public void login() {

        System.out.println("Student is logged in");
    }
}
