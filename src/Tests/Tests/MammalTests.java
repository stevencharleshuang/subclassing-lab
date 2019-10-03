package Tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.company.Mammal;

public class MammalTests {
    private Mammal mammal;

    @Before
    public void createMammal() {
        mammal = new Mammal(25, true, "Asian Elephant", false, "Brooooeeuhhh", "grey");
    }

    @Test
    public void testIsCarnivore() {
        assertFalse(mammal.isCarnivore());
    }

    @Test
    public void testAnimallCall() {
        assertEquals("Brooooeeuhhh", mammal.getAnimalCall());
        assertEquals("The Asian Elephant says: Brooooeeuhhh!", mammal.call());
    }

    @Test
    public void testGetColor() {
        assertEquals("grey", mammal.getColor());
    }
}
