import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;

    @Before
    public void before(){
        tank = new Tank("Tank", 80);
    }

    @Test
    public void hasType(){
        assertEquals("Tank", tank.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(80, tank.getHealthValue());
    }
}
