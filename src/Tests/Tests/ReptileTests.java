package Tests;

import org.junit.Before;
import org.junit.Test;

import com.company.Reptile;

import static org.junit.Assert.*;

public class ReptileTests {
    private Reptile reptile;

    @Before
    public void createReptile() {
        reptile = new Reptile(35, false, "Mutated Reptilian Beast", true);
    }

    @Test
    public void testReptileGetProps() {
        assertEquals(35, reptile.getTopSpeed());
        assertFalse(reptile.isEndangered());
        assertEquals("Mutated Reptilian Beast", reptile.getName());
        assertTrue(reptile.isVenomous());
    }

    @Test
    public void testReptileIsVenomous() {
        assertTrue(reptile.isVenomous());
    }
}
