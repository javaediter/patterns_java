package ec.editer.patterns.factory;

public class PizzaStore {
    PizzaFactory pizzaFactory;
    public PizzaStore() {
        pizzaFactory = new PizzaFactory();
    }
    public Pizza orderPizza(TypePizza type) {
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
