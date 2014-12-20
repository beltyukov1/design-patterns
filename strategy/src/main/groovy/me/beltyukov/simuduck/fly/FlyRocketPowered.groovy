package me.beltyukov.simuduck.fly

class FlyRocketPowered implements FlyBehavior {

    @Override
    void fly() {
        println "I'm flying with a rocket!"
    }
}
