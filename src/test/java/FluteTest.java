import Enums.ColourTypes;
import Enums.InstrumentTypes;
import Enums.MaterialTypes;
import Instruments.Flute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void setUp() throws Exception {
        flute = new Flute("Pearl", "PF-505", MaterialTypes.TIN, ColourTypes.SILVER, InstrumentTypes.WOODWIND, 100.00,  189.95, false);
    }

    @Test
    public void canGetIrishState() {
        assertEquals(false, flute.getIrishState());
    }

    @Test
    public void canPlay() {
        assertEquals("Doooo, deedly doooo", flute.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(89.95, flute.calculateMarkup(), 0.01);
    }
}
