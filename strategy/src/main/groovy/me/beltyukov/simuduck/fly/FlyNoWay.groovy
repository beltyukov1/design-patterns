package me.beltyukov.simuduck.fly

class FlyNoWay implements FlyBehavior {

    @Override
    void fly() {
        println "I can't fly"
    }
}
