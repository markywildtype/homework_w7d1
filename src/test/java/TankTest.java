import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;
    Kaiju rodan;

    @Before
    public void before(){
        tank = new Tank("Tank", 80, 20);
        rodan = new Dragon("Rodan", 100, 15);
    }

    @Test
    public void hasType(){
        assertEquals("Tank", tank.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(80, tank.getHealthValue());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(20, tank.getAttackValue());
    }

    @Test
    public void canAttack(){
        tank.ramAttack(rodan);
        assertEquals(80, rodan.getHealthValue());
    }

    @Test
    public void canRocketAttack(){
        tank.rocketAttack(rodan);
        assertEquals(70, rodan.getHealthValue());
    }
}
