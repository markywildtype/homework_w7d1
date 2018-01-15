import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiantLizardTest {

    GiantLizard gojira;

    @Before
    public void before(){
        gojira = new GiantLizard("Gojira", 100, 25);
    }

    @Test
    public void hasName(){
        assertEquals("Gojira", gojira.getName());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(100, gojira.getHealthValue());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(25, gojira.getAttackValue());
    }

    @Test
    public void canRoar(){
        assertEquals("Gojira ROOOAAAR!!!", gojira.roar());
    }
}
