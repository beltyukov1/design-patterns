package me.beltyukov.decorator.beverage

import me.beltyukov.decorator.base.Beverage

class HouseBlend extends Beverage {

    HouseBlend() {
        description = 'House blend'
    }

    @Override
    double cost() {
        0.89
    }
}
