package me.beltyukov.factory

abstract class Pizza {

    String name
    String dough
    String sauce
    List toppings = []

    void prepare() {
        println "Preparing $name"
        println "Tossing $dough"
        println "Adding $sauce"
        println 'Adding toppings: '
        toppings.each { topping ->
            println "   $topping"
        }
    }

    void bake() {
        println 'Bake for 25 minutes at 350'
    }

    void cut() {
        println 'Cutting the pizza into diagonal slices'
    }

    void box() {
        println 'Place pizza in offical PizzaStore box'
    }
}
