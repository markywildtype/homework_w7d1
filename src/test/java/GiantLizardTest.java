import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiantLizardTest {

    Kaiju gojira;
    Jeep jeep;

    @Before
    public void before(){
        gojira = new GiantLizard("Gojira", 100, 25);
        jeep = new Jeep("Jeep", 50, 10);
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

    @Test
    public void canAttack(){
        gojira.attack(jeep);
        assertEquals(25, jeep.getHealthValue());
    }

    @Test
    public void canMove(){
        assertEquals("Gojira STOMP!", gojira.move());
    }

    @Test
    public void healthValueCannotBeNegative(){
        jeep.minigunAttack(gojira);
        jeep.minigunAttack(gojira);
        jeep.minigunAttack(gojira);
        jeep.minigunAttack(gojira);
        jeep.minigunAttack(gojira);
        jeep.minigunAttack(gojira);
        jeep.minigunAttack(gojira);
        assertEquals(0, gojira.getHealthValue());

    }
}
