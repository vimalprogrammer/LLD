import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Client {

    static void main() {

        Item i1 = new Item("1","Bat",5,1000);
        Item i2 = new Item("2","ABC",10,300);
        Item i3 = new Item("3","XYZ",7,1200);

        List<Item> items = new ArrayList<>();
        items.add(i1);
        items.add(i2);
        items.add(i3);

        Collections.sort(items, new ItemPriceComparator());

        for(Item item: items) {
            System.out.println(item);
        }

//        Electronics e1 = new Electronics("10","Fridge",20,25000,3);
//        Electronics e2 = new Electronics("11","Fan",15,2500,5);
//
//        Inventory<Electronics> electronicsInventory = new Inventory<>();
//        electronicsInventory.addItem(e1);
//        electronicsInventory.addItem(e2);
//
//        System.out.println("DEBUG");
//
//        System.out.println(electronicsInventory.getAllItems());
//        System.out.println("DEBUG");
    }
}
