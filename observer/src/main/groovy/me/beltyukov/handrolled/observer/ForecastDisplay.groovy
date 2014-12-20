package me.beltyukov.handrolled.observer

import me.beltyukov.common.observer.DisplayElement
import me.beltyukov.handrolled.subject.WeatherData

class ForecastDisplay implements Observer, DisplayElement {

    private Float currentPressure = 29.92
    private Float lastPressure
    private WeatherData weatherData

    ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
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
    void update(Float temperature, Float humidity, Float pressure) {
        lastPressure = currentPressure
        currentPressure = pressure

        display()
    }
}
