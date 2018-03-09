import Enums.ColourTypes;
import Enums.InstrumentTypes;
import Enums.MaterialTypes;
import Instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void setUp() throws Exception {
        keyboard = new Keyboard("Casio", "Plinky Plonk", MaterialTypes.PLASTIC, ColourTypes.PURPLE, InstrumentTypes.KEYBOARD, 158.50, 225.99, 25, "Greensleeves");

    }

    @Test
    public void canGetNoOfKeys() {
        assertEquals(25, keyboard.getNoOfKeys());
    }

    @Test
    public void canGetDemoSong() {
        assertEquals("Greensleeves", keyboard.getDemoSong());
    }

    @Test
    public void canPlay() {
        assertEquals("Plinky plonk", keyboard.play());
    }
}
