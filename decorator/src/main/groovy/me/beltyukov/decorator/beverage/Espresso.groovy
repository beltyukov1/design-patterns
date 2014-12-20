package me.beltyukov.decorator.beverage

import me.beltyukov.decorator.base.Beverage

class Espresso extends Beverage {

    Espresso() {
        description = 'Espresso'
    }

    @Override
    double cost() {
        1.99
    }
}
