package ec.editer.tests;

import ec.editer.patterns.strategy.Duck;
import ec.editer.patterns.strategy.MallardDuck;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    public void testDucks(){
        Duck duck = new MallardDuck();
        assertEquals("MallardDuck => FlyWithWings and Quack", duck.toString());
    }
}
