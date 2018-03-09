package Instruments;

import Enums.ColourTypes;
import Enums.InstrumentTypes;
import Enums.MaterialTypes;
import Interfaces.Playable;
import Interfaces.Saleable;

public class Trombone extends Instrument {

    private Boolean valvedState;

    public Trombone(String make, String model, MaterialTypes material, ColourTypes colour, InstrumentTypes type, double buyPrice, double sellPrice, Boolean valvedState) {
        super(make, model, material, colour, type, buyPrice, sellPrice);
        this.valvedState = valvedState;
    }

    public Boolean getValvedState() {
        return valvedState;
    }

    public String play() {
        return "Bom bom bom";
    }
}
