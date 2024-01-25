package ec.editer.patterns.decorator;

import java.text.NumberFormat;

public abstract class Beverage {
    protected String description;
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
