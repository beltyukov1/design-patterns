package me.beltyukov.api.observer

import me.beltyukov.api.subject.WeatherData
import me.beltyukov.common.observer.DisplayElement

class ForecastDisplay implements Observer, DisplayElement {

    private Observable observable
    private Float currentPressure = 29.92
    private Float lastPressure

    ForecastDisplay(Observable observable) {
        this.observable = observable
        observable.addObserver(this)
    }

    @Override
    void display() {
        println 'Forecast: '
        if (currentPressure > lastPressure) {
            println 'Improving weather on the way!'
        } else if (currentPressure < lastPressure) {
            println 'Watch out for cooler, rainier weather'
        } else {
            println 'More of the same!'
        }
    }

    @Override
    void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            def weatherData = (WeatherData) o
            lastPressure = currentPressure
            currentPressure = weatherData.pressure

            display()
        }
    }
}
