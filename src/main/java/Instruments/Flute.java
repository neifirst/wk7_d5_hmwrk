package Instruments;

import Enums.ColourTypes;
import Enums.InstrumentTypes;
import Enums.MaterialTypes;
import Interfaces.Playable;
import Interfaces.Saleable;

public class Flute extends Instrument {

    private Boolean irishState;

    public Flute(String make, String model, MaterialTypes material, ColourTypes colour, InstrumentTypes type, double buyPrice, double sellPrice, Boolean irishState) {
        super(make, model, material, colour, type, buyPrice, sellPrice);
        this.irishState = irishState;
    }

    public Boolean getIrishState() {
        return irishState;
    }

    public String play() {
        return "Doooo, deedly doooo";
    }


}