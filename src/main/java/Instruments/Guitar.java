package Instruments;

import Enums.ColourTypes;
import Enums.InstrumentTypes;
import Enums.MaterialTypes;
import Interfaces.Playable;
import Interfaces.Saleable;

public class Guitar extends Instrument {

    private int noOfStrings;

    public Guitar(String make, String model, MaterialTypes material, ColourTypes colour, InstrumentTypes type, double buyPrice, double sellPrice, int noOfStrings) {
        super(make, model, material, colour, type, buyPrice, sellPrice);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String play() {
        return "Weedly weedly, ching ching";
    }
}
