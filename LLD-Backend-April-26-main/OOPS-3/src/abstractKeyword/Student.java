package abstractKeyword;

public class Student extends User{

    int age;

    public Student(String name, int age) {
        super(name);
        this.age = age;
        System.out.println("Student constreuctor is called");
    }
}
