package me.beltyukov.simuduck.duck

import me.beltyukov.simuduck.fly.FlyWithWings
import me.beltyukov.simuduck.quack.Quack

/**
 * Created by Alex on 12/10/14.
 */
class MallardDuck extends Duck {

    MallardDuck() {
        flyBehavior = new FlyWithWings()
        quackBehavior = new Quack()
    }

    @Override
    void display() {
        println "I'm a real Mallard Duck"
    }
}
