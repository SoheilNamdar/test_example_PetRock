import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.*;


class PetRockTest {
        PetRock petRock = new PetRock("john");

        @Test
    public void getName() {
        Logger l = Logger.getLogger(PetRock.class.getName());
        l.info("Name: " + petRock.getName());

        assertEquals("john", petRock.getName());
    }

    @Test
    public void testHappy() {
            assertFalse(petRock.isHappy());
    }

    @Test
    public void testHappyAfterPlay() {
            petRock.playWithRock();
            assertTrue(petRock.isHappy());
    }

    @Test
    public void testGetHappyMessage() {
        Assertions.assertThrows(IllegalStateException.class, () -> {
            petRock.getHappyMessage();
         });
    }

    @Test
    public void testName() {
            petRock.playWithRock();
            assertEquals("i'm happy", petRock.getHappyMessage());
    }





}