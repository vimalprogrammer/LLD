package synchronization;

public class Value {

    int x;
    public Value(int x) {
        this.x = x;
    }

    public synchronized void increment(int i) {
        this.x += i;
    }

    public synchronized void decrement(int i) {
        this.x -= i;
    }
}
