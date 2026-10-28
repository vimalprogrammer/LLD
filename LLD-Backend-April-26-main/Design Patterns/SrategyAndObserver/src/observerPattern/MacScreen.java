package observerPattern;

public class MacScreen implements Observer{
    @Override
    public void notify(int temp) {
        System.out.println("Temp has changed on Mac scree"+ temp);
    }
}
