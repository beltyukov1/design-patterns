package me.beltyukov.simuduck.quack

class Squeak implements QuackBehavior {

    @Override
    void quack() {
        println 'Squeak'
    }
}
