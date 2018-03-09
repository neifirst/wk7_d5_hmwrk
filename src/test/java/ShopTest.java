import Enums.ColourTypes;
import Enums.InstrumentTypes;
import Enums.MaterialTypes;
import Enums.ProductsTypes;
import Instruments.Flute;
import Instruments.Keyboard;
import Interfaces.Saleable;
import Locations.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private ArrayList<Saleable> stock;
    private Flute flute;
    private Keyboard keyboard;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Guns 'n Banjoes");
        stock = new ArrayList<>();
        flute = new Flute("Pearl", "PF-505", MaterialTypes.TIN, ColourTypes.SILVER, InstrumentTypes.WOODWIND, 100.00,  189.95, false);
        keyboard = new Keyboard("Casio", "Plinky Plonk", MaterialTypes.PLASTIC, ColourTypes.PURPLE, InstrumentTypes.KEYBOARD, 158.50, 225.99, 25, "Greensleeves");
    }

    @Test
    public void canAddToStock() {
        shop.addStockItem(ProductsTypes.BRASSO);
        shop.addStockItem(flute);
        assertEquals(2, shop.countStock());
    }

    @Test
    public void canRemoveStockItems() {
        shop.addStockItem(ProductsTypes.AK47);
        shop.addStockItem(flute);
        shop.removeStockItem(flute);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canGetPotentialProfit() {
        shop.addStockItem(flute);
        shop.addStockItem(keyboard);
        shop.addStockItem(ProductsTypes.DRUMSTICK);
        shop.addStockItem(ProductsTypes.BRASSO);
        shop.addStockItem(ProductsTypes.PLECTRUM);
        shop.addStockItem(ProductsTypes.AK47);

        assertEquals(422.77, shop.calculateTotalProfit(), 0.01);
    }
}
