package semaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {

    private int maxSize;
    private ConcurrentLinkedDeque<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }

    public void addItem(Object item) {
        System.out.println("Item is produced: " + items.size());
        items.add(item);
    }

    public void removeItem() {
        System.out.println("Item is consumed: "+(items.size()-1));
        items.remove();

    }
}
