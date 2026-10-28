package observerPattern;

public class IpadScreen implements Observer{
    @Override
    public void notify(int temp) {
        System.out.println("Temp changed on IpadScree "+temp);
    }
}
