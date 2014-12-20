package me.beltyukov.api.observer

import me.beltyukov.api.subject.WeatherData
import me.beltyukov.common.observer.DisplayElement

class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable observable
    private Float temperature
    private Float humidity

    CurrentConditionsDisplay(Observable observable) {
        this.observable = observable
        observable.addObserver(this)
    }

    @Override
    void display() {
        println "\nCurrent conditions: ${temperature}F degrees and ${humidity}% humidity"
    }

    @Override
    void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            def weatherData = (WeatherData) o
            temperature = weatherData.temperature
            humidity = weatherData.humidity
            display()
        }
    }
}
