package me.beltyukov.factory

class NYStyleCheesePizza extends Pizza {

    NYStyleCheesePizza() {
        name = 'NY Style Sauce and Cheese Pizza'
        dough = 'Thin Crust Dough'
        sauce = 'Marinara Suace'

        toppings << 'Grated Reggiano Cheese'
    }
}
