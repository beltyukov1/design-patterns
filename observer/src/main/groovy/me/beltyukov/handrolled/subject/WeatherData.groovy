package me.beltyukov.handrolled.subject

import me.beltyukov.handrolled.observer.Observer

/**
 * Created by Alex on 12/13/14.
 */
class WeatherData implements Subject {

    private List observers = []
    private Float temperature
    private Float humidity
    private Float pressure

    @Override
    void registerObserver(Observer observer) {
        observers << observer
    }

    @Override
    void removeObserver(Observer observer) {
        if (observers.indexOf(observer)) {
            observers.remove(observer)
        }
    }

    @Override
    void notifyObservers() {
        observers.each { observer ->
            observer.update(temperature, humidity, pressure)
        }
    }

    void measurementsChanged() {
        notifyObservers()
    }

    void setMeasurements(Float temperature, Float humidity, Float pressure) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}
