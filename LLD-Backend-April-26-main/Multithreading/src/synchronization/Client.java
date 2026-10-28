package synchronization;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Lock lock = new ReentrantLock();
        Value value = new Value(0);
        Adder adder = new Adder(value,lock);
        Subtracter subtracter = new Subtracter(value,lock);



        ExecutorService ex = Executors.newFixedThreadPool(2);
        Future<Void> futureAdder = ex.submit(adder);
        Future<Void> futureSub = ex.submit(subtracter);
//        ex.execute(adder);
//        ex.execute(subtracter);

        futureAdder.get();
        futureSub.get();

        System.out.println(value.x);

        ex.shutdown();
    }
}
