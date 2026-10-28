package observerPattern;

import java.util.List;

public class AppleWeatherService {

    private List<Observer> observers;

    public AppleWeatherService(List<Observer> observers, int temp) {
        this.observers = observers;
        this.temp = temp;
    }

    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    int temp;
    public void updateTemp(int change) {
        temp += change;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for(Observer observer: observers) {
            observer.notify(temp);
        }
    }
}
