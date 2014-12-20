package me.beltyukov.simuduck

import me.beltyukov.simuduck.duck.Duck
import me.beltyukov.simuduck.duck.MallardDuck
import me.beltyukov.simuduck.duck.ModelDuck
import me.beltyukov.simuduck.fly.FlyRocketPowered

class SimUDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck()
        mallard.performQuack()
        mallard.performFly()

        Duck modelDuck = new ModelDuck()
        modelDuck.performFly()
        modelDuck.flyBehavior = new FlyRocketPowered()
        modelDuck.performFly()
    }
}
