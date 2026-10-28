package inheritance;

public class Student extends User{

    double psp;

//    public Student() {
//        super("ABC",23);
//        System.out.println("Student constrcutor is called");
//    }


//    public Student(String name, int age, double psp) {
//        super(name,age);
//        this.psp = psp;
//    }

    public Student() {

    }

    public Student(String name) {
        super();
//        super();
        this.name = name;
    }



    public Student(String name, int age) {
        this(name); // this.name = name
        this.age = age;
    }

    public Student(String name,int age, double psp) {
        this(name,age);
        this.psp = psp;
    }

    public void hello() {
        System.out.println("HELLO from student");
    }
}
