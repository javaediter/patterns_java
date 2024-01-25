package ec.editer.tests;

import ec.editer.patterns.decorator.Beverage;
import ec.editer.patterns.decorator.DarkRoast;
import ec.editer.patterns.decorator.Milk;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DecoratorTest {

    @Test
    public void testBeverage(){
        DarkRoast darkRoast = new DarkRoast();
        Milk milk = new Milk(darkRoast);
        assertEquals("DarkRoast Beverage", darkRoast.getDescription());
        assertTrue(darkRoast.cost() > 0);
        assertEquals("Milk CondimentDecorator", milk.getDescription());
        assertFalse(darkRoast.cost() < 0);
    }
}
