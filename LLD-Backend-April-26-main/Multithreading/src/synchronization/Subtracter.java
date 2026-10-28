package synchronization;

import mergeSort.Sorter;

import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtracter implements Callable<Void> {

    private Value value;
    private Lock lock;

    public Subtracter(Value value, Lock lock) {
        this.lock = lock;
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=100;i++) {
            value.decrement(i);
        }
        return null;
    }
//
//    public void doSomething(int x) {
//        this.value.x -= x;
//    }

//    @Override
//    public void run() {
//        for(int i=1;i<=100;i++) {
//            this.value.x -= i;
//        }
//    }

//    @Override
//    public Void call() throws Exception {
//       // lock.lock();
//        for(int i=1;i<=100;i++) {
//             // try to acquire
//            synchronized (value) {
//            this.value.x -= i;
//            System.out.println("Subtractor is subtracting "+i);
//            }
//        }
//        //lock.unlock();
//        return null;
//    }
}
