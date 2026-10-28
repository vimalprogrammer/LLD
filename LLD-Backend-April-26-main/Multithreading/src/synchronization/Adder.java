package synchronization;

import mergeSort.Sorter;

import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value value;
    private Lock lock;

    public Adder(Value value, Lock lock) {
        this.lock = lock;
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
       for(int i=1;i<=100;i++) {
           value.increment(i);
       }
       return null;
    }

//    @Override
//    public void run() {
//        for(int i=1;i<=100;i++) {
//            if(i==50) {
//                try {
//                    Thread.sleep(10000);
//                    System.out.println("Hello");
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            this.value.x += i;
//        }
//    }

//    @Override
//    public Void call() throws Exception {
//       // lock.lock(); // try to acquire
//        for(int i=1;i<=100;i++) {
//            synchronized (value) {
//            this.value.x += i;
//            System.out.println("Adder is adding "+ i);
//            }
//        }
////        lock.unlock();
//        return null;
//    }
}
