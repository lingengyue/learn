package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private float temperature;

    private float pressure;

    private float humidity;

    private List<Observer> observers = new ArrayList<>();

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, pressure, humidity);
        }
    }
}
