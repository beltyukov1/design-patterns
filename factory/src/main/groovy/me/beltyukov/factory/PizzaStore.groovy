package me.beltyukov.factory

abstract class PizzaStore {

    Pizza orderPizza(String type) {
        def pizza = createPizza(type)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        pizza
    }

    abstract Pizza createPizza(String type)
}
