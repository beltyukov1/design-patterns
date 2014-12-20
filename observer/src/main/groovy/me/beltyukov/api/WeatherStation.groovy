package me.beltyukov.api

import me.beltyukov.api.observer.CurrentConditionsDisplay
import me.beltyukov.api.observer.ForecastDisplay
import me.beltyukov.api.subject.WeatherData

class WeatherStation {

    public static void main(String[] args) {
        def weatherData = new WeatherData()

        def forecastDisplay = new ForecastDisplay(weatherData)
        def currentDisplay = new CurrentConditionsDisplay(weatherData)
//        def statisticsDisplay = new StatisticsDisplay(weatherData)
//        def heatIndexDisplay = new HeatIndexDisplay(weatherData)

        weatherData.setMeasurements(80, 65, 30.4)
        weatherData.setMeasurements(82, 70, 29.2)
        weatherData.setMeasurements(78, 90, 29.2)
    }
}
