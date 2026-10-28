import java.util.*;

public class Inventory<T extends Item> {
    private HashMap<String, T> items;

    public Inventory() {
        items = new HashMap<>();
    }

    // ALWAYS DO VALIDATIONS FIRST
    public void addItem(T item) {
        // validations
        if(item.getQuantity() < 0) {
            throw new RuntimeException("Invaldi quantity");
        }
        // id should not exist
        items.put(item.getId(), item);
    }

    public void removeItem(String id) {
        items.remove(id);
    }

    public T getItem(String id) {
        return items.get(id);
    }

    public Collection<T> getAllItems() {
        return items.values();
    }
}
