package semaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Store store;

    private Semaphore producerSema;
    private Semaphore consumerSema;

    public Consumer(Store store,
                    Semaphore producerSema,
                    Semaphore consumerSema) {
        this.producerSema = producerSema;
        this.consumerSema = consumerSema;
        this.store = store;
    }

//    @Override
//    public void run() {
//        while (true) {
//            synchronized (store) {
//                if (store.getItems().size() > 0) {
//                    store.removeItem();
//                }
//            }
//        }
//    }

    @Override
    public void run() {
        while (true) {
            try {
                consumerSema.acquire(); // consumer--;
                store.removeItem();
                producerSema.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
