package me.beltyukov.decorator.beverage

import me.beltyukov.decorator.base.Beverage

class DarkRoast extends Beverage {

    DarkRoast() {
        description = 'Dark roast'
    }

    @Override
    double cost() {
        0.99
    }
}
