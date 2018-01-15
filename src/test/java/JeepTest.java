import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JeepTest {

    Jeep jeep;
    Kaiju gojira;

    @Before
    public void before(){
        jeep = new Jeep("Jeep", 50, 10);
        gojira = new GiantLizard("Gojira", 100, 25);
    }

    @Test
    public void hasType(){
        assertEquals("Jeep", jeep.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(50, jeep.getHealthValue());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(10, jeep.getAttackValue());
    }

    @Test
    public void canRamAttack(){
        jeep.ramAttack(gojira);
        assertEquals(90, gojira.getHealthValue());
    }

    @Test
    public void canMinigunAttack(){
        jeep.minigunAttack(gojira);
        assertEquals(85, gojira.getHealthValue());
    }
}
