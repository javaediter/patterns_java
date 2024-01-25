package ec.editer.patterns;

import ec.editer.patterns.decorator.DarkRoast;
import ec.editer.patterns.decorator.Milk;
import ec.editer.patterns.decorator.Mocha;

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
    }
}
