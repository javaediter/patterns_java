package ec.editer.tests;

import ec.editer.patterns.singleton.SimpleWindowSingleton;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void testGetInstances(){
        SimpleWindowSingleton singleton = SimpleWindowSingleton.getInstance();
        assertEquals(1,singleton.getCounter());
    }
}
