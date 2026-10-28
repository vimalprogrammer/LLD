public class Item implements Comparable<Item>{

    private String id;
    private String name;
    private int quantity;
    private double price;

    public Item() {
    }

    public Item(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // this & other
    // if you want this to come first, return -ve value
    // if you want other to come first, return +ve value
    // return 0

    // sort based on price asc, quantity desc
    @Override
    public int compareTo(Item other) {
//        if(this.getPrice() < other.getPrice()) {
//            return -1;
//        }
//        else if(this.getPrice() > other.getPrice()) {
//            return +1;
//        }
//        else if(this.getQuantity() <other.getQuantity()) {
//            return -1;
//        }
//        else if(this.getQuantity() > other.getQuantity()) {
//            return 1;
//        }
//        return 0;
      //  return Double.compare(other.getPrice(),this.getPrice());
        return this.getName().compareTo(other.getName());
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    
}
