package me.beltyukov.decorator.condiments

import me.beltyukov.decorator.base.Beverage
import me.beltyukov.decorator.base.CondimentDecorator

class Whip extends CondimentDecorator {

    Beverage beverage

    Whip(Beverage beverage) {
        this.beverage = beverage
    }

    @Override
    String getDescription() {
        "${beverage.description}, whip"
    }

    @Override
    double cost() {
        beverage.cost() + 0.10
    }
}
