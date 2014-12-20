package me.beltyukov.simuduck.fly

class FlyWithWings implements FlyBehavior {

    @Override
    void fly() {
        println "I'm flying!"
    }
}
