package staticKeyword;

public class Client {

    public static void main(String[] args) {
        Car c1 = new Car("ABC");
        Car c2 = new Car("XYZ");

//        System.out.println(c1.count);
//        System.out.println(c2.count);
        System.out.println(Car.count);
        Car.fun1();


    }
}
