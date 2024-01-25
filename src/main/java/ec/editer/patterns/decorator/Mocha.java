package ec.editer.patterns.decorator;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage){
        description = this.getClass().getSimpleName() + " " + this.getClass().getSuperclass().getSimpleName();
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return 0.80 + beverage.cost();
    }
}
