package Head_ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class weatherData implements Subject{

    private float temp;
    private float pressure;
    private float humidity;
    private List<Observer> observers;

    public weatherData() {
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void removeObserver(Observer obj) {
       observers.remove(obj);
    }

    @Override
    public void notifyObserver() {
       for (Observer observer : observers) {
           observer.update(temp, pressure, humidity);
       }
    }
    public void setWeatherData(float temp, float pressure, float humidity) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObserver();
    }
}
