package me.beltyukov.simuduck.duck

import me.beltyukov.simuduck.fly.FlyNoWay
import me.beltyukov.simuduck.quack.Quack

class ModelDuck extends Duck {

    ModelDuck() {
        flyBehavior = new FlyNoWay()
        quackBehavior = new Quack()
    }

    @Override
    void display() {

    }
}
