package me.beltyukov.handrolled.observer

interface Observer {

    void update(Float temperature, Float humidity, Float pressure)
}