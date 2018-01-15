import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiantLizardTest {

    GiantLizard gojira;

    @Before
    public void before(){
        gojira = new GiantLizard("Gojira", 25, 100);
    }

    @Test
    public void hasName(){
        assertEquals("Gojira", gojira.getName());
    }
}
