import mergeSort.Sorter;

import java.util.List;
import java.util.Spliterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        System.out.println("Hello World" + " Thread name = "+Thread.currentThread().getName());
//
//        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
//        Thread t1 = new Thread(helloWorldPrinter);
//        t1.start();

        // print 1-100 using 100 separate threads

//        for (int i = 1; i <= 1000000; i++) {
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            Thread t = new Thread(numberPrinter);
//            t.start();
//        }


        // execute -> runnables
      //  ExecutorService ex = Executors.newFixedThreadPool(5);
        // 60 secs
//        ExecutorService ex = Executors.newCachedThreadPool();
//        for(int i=1;i<=1000000;i++) {
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            ex.execute(numberPrinter);
//        }
//
//        ex.shutdown();

        // exexute -> runnbales
        // submit -> callables
//        NumberMultiplier numberMultiplier = new NumberMultiplier(6);
//        ExecutorService ex = Executors.newFixedThreadPool(5);
//        Future<Integer> future = ex.submit(numberMultiplier);
//        System.out.println("A");
//        System.out.println("B");
//
//        int val = future.get();
//
//        System.out.println("B");

        List<Integer> arr = List.of(2,3,1,4,2,6);
        ExecutorService ex = Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(arr,ex);
        Future<List<Integer>> future = ex.submit(sorter);

        System.out.println(future.get());
    }
}
