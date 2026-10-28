public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        print();
    }

    public void print() {
        System.out.println("Hello world, "+ " Thread name = "+Thread.currentThread().getName());
    }
}
