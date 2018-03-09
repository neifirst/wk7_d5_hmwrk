import Enums.ColourTypes;
import Enums.InstrumentTypes;
import Enums.MaterialTypes;
import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Fender", "Weedly Weedly", MaterialTypes.WOOD, ColourTypes.RED, InstrumentTypes.STRING, 220.50, 449.50, 6);
    }

    @Test
    public void canGetNoOfStrings() {
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Weedly weedly, ching ching", guitar.play());
    }
}
