package me.beltyukov.api.subject

class WeatherData extends Observable {

    Float temperature
    Float humidity
    Float pressure

    void measurementsChanged() {
        setChanged()
        notifyObservers()
    }

    void setMeasurements(Float temperature, Float humidity, Float pressure) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}
