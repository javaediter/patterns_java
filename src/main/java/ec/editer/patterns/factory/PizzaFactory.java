package ec.editer.patterns.factory;

public class PizzaFactory {
    public static Pizza createPizza(TypePizza type) {
        if (type.equals(TypePizza.RICE)) {
            return new RicePizza();
        } else if (type.equals(TypePizza.PEPPERONI)) {
            return new PepperoniPizza();
        } else if (type.equals(TypePizza.VEGGIE)) {
            return new VeggiePizza();
        } else {
            return new CheesePizza();
        }
    }
}
