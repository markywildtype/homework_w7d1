import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon rodan;

    @Before
    public void before(){
        rodan = new Dragon("Rodan", 100, 15);
    }

    @Test
    public void hasName(){
        assertEquals("Rodan", rodan.getName());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(100, rodan.getHealthValue());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(15, rodan.getAttackValue());
    }

    @Test
    public void canRoar(){
        assertEquals("Rodan ROOOAAAR!!!", rodan.roar());
    }
}
