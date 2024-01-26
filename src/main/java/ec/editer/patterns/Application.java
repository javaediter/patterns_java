package ec.editer.patterns;

import ec.editer.patterns.decorator.DarkRoast;
import ec.editer.patterns.decorator.Milk;
import ec.editer.patterns.decorator.Mocha;
import ec.editer.patterns.factory.PepperoniPizza;
import ec.editer.patterns.factory.Pizza;
import ec.editer.patterns.factory.PizzaStore;
import ec.editer.patterns.factory.TypePizza;
import ec.editer.patterns.singleton.SimpleWindowSingleton;
import ec.editer.patterns.strategy.Duck;
import ec.editer.patterns.strategy.MallardDuck;

import java.text.NumberFormat;
import java.util.Locale;

public class Application {
    public static void main(String[] args){
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("en", "US"));

        //Pattern DECORATOR
        DarkRoast darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription() + " --> " + numberFormat.format(darkRoast.cost()));
        Milk milk = new Milk(darkRoast);
        System.out.println(milk.getDescription() + " --> " + numberFormat.format(milk.cost()));
        Mocha mocha = new Mocha(milk);
        System.out.println(mocha.getDescription() + " --> " + numberFormat.format(mocha.cost()));

        System.out.println();

        //Pattern SINGLETON
        SimpleWindowSingleton singleton = SimpleWindowSingleton.getInstance();
        singleton = SimpleWindowSingleton.getInstance();
        System.out.println("Instances= " + singleton.getCounter());

        System.out.println();

        //Pattern FACTORY
        PizzaStore pizzaStore = new PizzaStore();
        Pizza pizza = pizzaStore.orderPizza(TypePizza.PEPPERONI);
        System.out.println(pizza.getClass().getSimpleName());

        System.out.println();

        //Pattern STRATEGY
        Duck duck = new MallardDuck();
        duck.performanceFly();
        duck.performanceQuack();
        duck.display();
        System.out.println(duck);
    }
}
