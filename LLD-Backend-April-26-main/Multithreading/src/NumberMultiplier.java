import java.util.concurrent.Callable;

public class NumberMultiplier implements Callable<Integer> {

    int x;
    public NumberMultiplier(int x) {
        this.x = x;
    }

    @Override
    public Integer call() throws Exception {
//        Thread.sleep(10000);
        return this.x*5;
    }
}
