package me.beltyukov.decorator.condiments

import me.beltyukov.decorator.base.Beverage
import me.beltyukov.decorator.base.CondimentDecorator

class Mocha extends CondimentDecorator {

    Beverage beverage

    Mocha(Beverage beverage) {
        this.beverage = beverage
    }

    @Override
    String getDescription() {
        "${beverage.description}, mocha"
    }

    @Override
    double cost() {
        beverage.cost() + 0.20
    }
}
