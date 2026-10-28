import java.util.*;
import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Hello World");
        };

        Thread t = new Thread(task);
        t.start();

        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(-3);
        l.add(1);
        l.add(-5);


        MathematicalOperation multiplier = (a,b) -> a*b;
        MathematicalOperation adder = Integer::sum;
        System.out.println(adder.calculate(4,3));

//        int ans = multiplier.calculate(4,5);
//        System.out.println(ans);

//        Collections.sort(l,(a,b) -> a*a - b*b);
//
//        System.out.println(l);
    }
}
