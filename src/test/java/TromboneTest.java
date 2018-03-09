import Enums.ColourTypes;
import Enums.InstrumentTypes;
import Enums.MaterialTypes;
import Instruments.Trombone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {

    Trombone trombone;

    @Before
    public void setUp() throws Exception {
        trombone = new Trombone("Yamaha", "YSL-354", MaterialTypes.BRASS, ColourTypes.YELLOW, InstrumentTypes.BRASS, 290.00, 320.90, false);
    }

    @Test
    public void canGetValvedState() {
        assertEquals(false, trombone.getValvedState());
    }

    @Test
    public void canPlay() {
        assertEquals("Bom bom bom", trombone.play());
    }
}
