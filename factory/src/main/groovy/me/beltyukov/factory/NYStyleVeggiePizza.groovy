package me.beltyukov.factory

class NYStyleVeggiePizza extends Pizza {

    NYStyleVeggiePizza() {
        name = 'NY Style Veggie Pizza'
        dough = 'Thin Crust Dough'
        sauce = 'Marinara Suace'

        toppings += ['Mushrooms', 'Tomatoes']
    }
}
