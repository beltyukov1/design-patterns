package me.beltyukov.handrolled

import me.beltyukov.handrolled.observer.CurrentConditionsDisplay
import me.beltyukov.handrolled.observer.ForecastDisplay
import me.beltyukov.handrolled.observer.HeatIndexDisplay
import me.beltyukov.handrolled.observer.StatisticsDisplay
import me.beltyukov.handrolled.subject.WeatherData

class WeatherStation {

    public static void main(String[] args) {
        def weatherData = new WeatherData()

        def currentDisplay = new CurrentConditionsDisplay(weatherData)
        def forecastDisplay = new ForecastDisplay(weatherData)
        def statisticsDisplay = new StatisticsDisplay(weatherData)
        def heatIndexDisplay = new HeatIndexDisplay(weatherData)

        weatherData.setMeasurements(80, 65, 30.4)
        weatherData.setMeasurements(82, 70, 29.2)
        weatherData.setMeasurements(78, 90, 29.2)
    }
}
