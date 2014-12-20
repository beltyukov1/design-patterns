package me.beltyukov.decorator

import me.beltyukov.decorator.beverage.DarkRoast
import me.beltyukov.decorator.beverage.Espresso
import me.beltyukov.decorator.beverage.HouseBlend
import me.beltyukov.decorator.condiments.Mocha
import me.beltyukov.decorator.condiments.Soy
import me.beltyukov.decorator.condiments.Whip

class StarbuzzCoffee {

    public static void main(String[] args) {
        def beverage = new Espresso()
        println "${beverage.description} \$${beverage.cost()}"

        def beverage2 = new DarkRoast()
        beverage2 = new Mocha(beverage2)
        beverage2 = new Mocha(beverage2)
        beverage2 = new Whip(beverage2)
        println "${beverage2.description} \$${beverage2.cost()}"

        def beverage3 = new HouseBlend()
        beverage3 = new Soy(beverage3)
        beverage3 = new Whip(beverage3)
        beverage3 = new Mocha(beverage3)
        println "${beverage3.description} \$${beverage3.cost()}"
    }
}
