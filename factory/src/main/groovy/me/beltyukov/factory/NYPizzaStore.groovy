package me.beltyukov.factory

class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        switch(type) {
            case 'cheese':
                new NYStyleCheesePizza()
                break
            case 'veggie':
                new NYStyleVeggiePizza()
                break
            default:
                null
        }
    }
}
