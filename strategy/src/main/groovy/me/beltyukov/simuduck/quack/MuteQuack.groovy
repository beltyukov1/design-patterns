package me.beltyukov.simuduck.quack

class MuteQuack implements QuackBehavior {

    @Override
    void quack() {
        println '<< Silence >>'
    }
}
