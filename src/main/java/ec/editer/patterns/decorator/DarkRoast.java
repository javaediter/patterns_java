package ec.editer.patterns.decorator;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        description = this.getClass().getSimpleName() + " " + this.getClass().getSuperclass().getSimpleName();
    }
    @Override
    public double cost() {
        return 1.50;
    }
}
