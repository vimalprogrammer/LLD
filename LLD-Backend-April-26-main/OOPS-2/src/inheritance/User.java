package inheritance;

public class User {

    String name;
    int age;

    public User() {
        System.out.println("User constrcutor is called");
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void login() {
        System.out.println("User is logged in");
    }
}

