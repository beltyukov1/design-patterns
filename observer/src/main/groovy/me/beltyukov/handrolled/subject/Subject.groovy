package me.beltyukov.handrolled.subject

import me.beltyukov.handrolled.observer.Observer

interface Subject {

    void registerObserver(Observer observer)
    void removeObserver(Observer observer)
    void notifyObservers()
}