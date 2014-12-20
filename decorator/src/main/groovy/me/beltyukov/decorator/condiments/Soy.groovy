package me.beltyukov.decorator.condiments

import me.beltyukov.decorator.base.Beverage
import me.beltyukov.decorator.base.CondimentDecorator

class Soy extends CondimentDecorator {

    Beverage beverage

    Soy(Beverage beverage) {
        this.beverage = beverage
    }

    @Override
    String getDescription() {
        "${beverage.description}, soy"
    }

    @Override
    double cost() {
        beverage.cost() + 0.15
    }
}
