package semaphore;

import javax.crypto.Cipher;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    private Store store;

    private Semaphore producerSema;
    private Semaphore consumerSema;

    public Producer(Store store,
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
//                if (store.getItems().size() < store.getMaxSize()) {
//                    store.addItem(new Object());
//                }
//            }
//        }
//    }

    @Override
    public void run() {

        while (true) {
            try {
                producerSema.acquire(); // producer--
                store.addItem(new Object());
                consumerSema.release(); // consumer++:
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
