package me.beltyukov.simuduck.quack

class Quack implements QuackBehavior {

    @Override
    void quack() {
        println 'Quack'
    }
}
