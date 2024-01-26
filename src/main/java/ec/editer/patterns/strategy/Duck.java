package ec.editer.patterns.strategy;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    public void performanceFly(){
        flyBehavior.fly();
    }
    public void performanceQuack(){
        quackBehavior.quack();
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " => " + flyBehavior.getClass().getSimpleName() + " and " + quackBehavior.getClass().getSimpleName();
    }
    public abstract void display();
}
