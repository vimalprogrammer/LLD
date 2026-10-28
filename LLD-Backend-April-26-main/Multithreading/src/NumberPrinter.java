public class NumberPrinter implements Runnable{

    int x;

    public NumberPrinter(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        System.out.println(this.x + ", Thread - "+Thread.currentThread().getName());
    }
}
