public class Student {

    Student(){

    }

    Student(String name, String email, String universityName, int age) {
        this.name = name;
        this.email = email;
        this.universityName = universityName;
        this.age = age;
    }

    Student(String n) {
        name = n;
    }

    String name;
    String email;
    String universityName;
    int age;

    public void attendClass() {
        System.out.println("Student "+name+ " is attending the class");
    }
}
