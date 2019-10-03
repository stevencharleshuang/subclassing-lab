package Tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.company.Animal;

public class AnimalTests {
    private Animal animal;

    @Before
    public void createAnimal() {
        this.animal = new Animal(55, false, "Cheetah");
    }

    @Test
    public void TestGetAnimalProps() {
        assertEquals(55, animal.getTopSpeed());
        assertFalse(animal.isEndangered());
        assertEquals("Cheetah", animal.getName());
    }
}
