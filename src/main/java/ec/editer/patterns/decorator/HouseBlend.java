package ec.editer.patterns.decorator;

public class HouseBlend extends Beverage{
    public HouseBlend(){
        description = this.getClass().getSimpleName() + " " + this.getClass().getSuperclass().getSimpleName();
    }
    @Override
    public double cost() {
        return 1.20;
    }
}
