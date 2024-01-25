package ec.editer.patterns.decorator;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage){
        description = this.getClass().getSimpleName() + " " + this.getClass().getSuperclass().getSimpleName();
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return 0.50 + beverage.cost();
    }
}
