package me.beltyukov.handrolled.observer

import me.beltyukov.common.observer.DisplayElement
import me.beltyukov.handrolled.subject.WeatherData

class StatisticsDisplay implements Observer, DisplayElement {

    private Float tempSum = 0
    private Float maxTemp = 0
    private Float minTemp = 200
    private Integer numOfReadings = 0
    private WeatherData weatherData

    StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    @Override
    void display() {
        println "Avg/Max/Min temperature = ${tempSum / numOfReadings}/${maxTemp}/${minTemp}"
    }

    @Override
    void update(Float temperature, Float humidity, Float pressure) {
        tempSum += temperature
        numOfReadings++

        if (temperature > maxTemp) {
            maxTemp = temperature
        }

        if (temperature < minTemp) {
            minTemp = temperature
        }

        display()
    }
}
