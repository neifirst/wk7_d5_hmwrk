package Instruments;

import Enums.ColourTypes;
import Enums.InstrumentTypes;
import Enums.MaterialTypes;
import Interfaces.Playable;
import Interfaces.Saleable;

public abstract class Instrument implements Saleable, Playable {

    private String make;
    private String model;
    private MaterialTypes material;
    private ColourTypes colour;
    private InstrumentTypes type;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String make, String model, MaterialTypes material, ColourTypes colour, InstrumentTypes type, double buyPrice, double sellPrice) {
        this.make = make;
        this.model = model;
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    @Override
    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }


}
