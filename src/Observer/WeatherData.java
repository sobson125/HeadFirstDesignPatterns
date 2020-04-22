package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private Float temperature;
    private Float humidity;
    private Float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        int indexOfElement = observers.indexOf(observer);
        if (indexOfElement >=0){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
    public void readData(){
        notifyAllObservers();
    }

    public void setAllParameters(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        readData();
    }
}
