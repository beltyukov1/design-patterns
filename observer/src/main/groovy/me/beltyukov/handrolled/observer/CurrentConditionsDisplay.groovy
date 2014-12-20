package me.beltyukov.handrolled.observer

import me.beltyukov.common.observer.DisplayElement
import me.beltyukov.handrolled.subject.Subject

class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Float temperature
    private Float humidity
    private Subject weatherData

    CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    @Override
    void display() {
        println "\nCurrent conditions: ${temperature}F degrees and ${humidity}% humidity"
    }

    @Override
    void update(Float temperature, Float humidity, Float pressure) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }
}
