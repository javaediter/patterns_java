package ec.editer.patterns.factory;

public class Pizza {
    protected Pizza pizza;
    public void bake(){
        System.out.println("...baking");
    }
    public void cut(){
        System.out.println("...cutting");
    }
    public void box(){
        System.out.println("...boxing");
    }
    public Pizza prepare(TypePizza type){
        pizza = PizzaFactory.createPizza(type);
        System.out.println("...preparing " + pizza.getClass().getSimpleName());
        return pizza;
    }
}
