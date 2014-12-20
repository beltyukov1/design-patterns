package me.beltyukov.handrolled.observer

import me.beltyukov.common.observer.DisplayElement
import me.beltyukov.handrolled.subject.WeatherData

class HeatIndexDisplay implements Observer, DisplayElement {

    private Float heatIndex
    private WeatherData weatherData

    HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    @Override
    void display() {
        println "Heat index is ${heatIndex}%"
    }

    @Override
    void update(Float temperature, Float humidity, Float pressure) {
        heatIndex = computeHeatIndex(temperature, humidity)
        display()
    }

    private static Float computeHeatIndex(Float t, Float rh) {
        ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh))) as Float
    }

}
