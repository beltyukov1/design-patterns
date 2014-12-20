package me.beltyukov.decorator.beverage

import me.beltyukov.decorator.base.Beverage

class Decaf extends Beverage {

    Decaf() {
        description = 'Decaf'
    }

    @Override
    double cost() {
        1.05
    }
}
