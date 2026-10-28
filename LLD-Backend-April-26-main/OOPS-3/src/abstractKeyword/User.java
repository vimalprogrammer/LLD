package abstractKeyword;

public abstract class User {

    String name;

    public User(String name) {
        this.name = name;
        System.out.println("User constrcutor is called");
    }
}
