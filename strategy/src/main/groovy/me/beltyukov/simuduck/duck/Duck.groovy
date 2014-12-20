package me.beltyukov.simuduck.duck

import me.beltyukov.simuduck.fly.FlyBehavior
import me.beltyukov.simuduck.quack.QuackBehavior

abstract class Duck {

    FlyBehavior flyBehavior
    QuackBehavior quackBehavior

    abstract void display()

    void performFly() {
        flyBehavior.fly()
    }

    void performQuack() {
        quackBehavior.quack()
    }

    void swim() {
        println 'All ducks float, even decoys!'
    }
}
