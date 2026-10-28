package observerPattern;

import java.time.temporal.Temporal;

public class IphoneScreen implements Observer{


    public void displayTempOnIphone(int temp) {
        // UI logic
        System.out.println("Temp has changed in Iphone Screen "+temp);
    }

    @Override
    public void notify(int temp) {
        displayTempOnIphone(temp);
    }
}
