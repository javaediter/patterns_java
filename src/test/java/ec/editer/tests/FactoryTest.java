package ec.editer.tests;

import ec.editer.patterns.factory.CheesePizza;
import ec.editer.patterns.factory.Pizza;
import ec.editer.patterns.factory.TypePizza;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FactoryTest {
    @Test
    public void testCreatePizza(){
        Pizza pizza = new Pizza().prepare(TypePizza.CHEESE);
        assertNotNull(pizza);
        assertInstanceOf(CheesePizza.class, pizza);
    }
}
