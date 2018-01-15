import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JeepTest {

    Jeep jeep;

    @Before
    public void before(){
        jeep = new Jeep("Jeep", 50);
    }

    @Test
    public void hasType(){
        assertEquals("Jeep", jeep.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(50, jeep.getHealthValue());
    }
}
