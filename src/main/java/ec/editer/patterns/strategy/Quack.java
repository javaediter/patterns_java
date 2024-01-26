package ec.editer.patterns.strategy;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack!");
    }
}
