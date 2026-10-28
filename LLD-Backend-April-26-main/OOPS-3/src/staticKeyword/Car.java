package staticKeyword;

public class Car {

    String model;
    static int count;

    public Car(String model) {
        this.model = model;
        count++;
    }

    public static void fun1() {
        System.out.println("I belong to the Class");
    }

    public void fun2() {

    }
}
