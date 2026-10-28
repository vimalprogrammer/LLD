package abstraction;

import javax.print.attribute.standard.PrinterMakeAndModel;

public class Clien {

    public static void makeRun(CanRun a) {
        a.run();
    }

    public static void main(String[] args) {
//        Cat c = new Cat();
//        c.run();

//        Student s = new Student();
//        s.sayHello();
//        s.login();

        makeRun(new Cat());
       makeRun(new Dog());
        System.out.println(new RoboticDog());
    }
}
