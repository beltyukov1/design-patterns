package me.beltyukov.factory

class PizzaTestDrive {

    public static void main(String[] args) {
        def nyStore = new NYPizzaStore()
        def pizza = nyStore.orderPizza('cheese')
        println "Alex ordered a ${pizza.name}"
    }
}
