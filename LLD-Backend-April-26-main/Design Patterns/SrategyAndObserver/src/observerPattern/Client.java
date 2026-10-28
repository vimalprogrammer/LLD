package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        IphoneScreen iphoneScreen = new IphoneScreen();
        MacScreen macScreen = new MacScreen();

        List<Observer> observers = new ArrayList<>();
        observers.add(iphoneScreen);
        observers.add(macScreen);
        AppleWeatherService weatherService = new AppleWeatherService(observers,25);

       // weatherService.updateTemp(5);

        weatherService.subscribe(new IpadScreen());

       // weatherService.updateTemp(3);
        weatherService.unsubscribe(iphoneScreen);

        weatherService.updateTemp(4);
    }
}
