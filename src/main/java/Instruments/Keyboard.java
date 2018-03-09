package Instruments;

import Enums.ColourTypes;
import Enums.InstrumentTypes;
import Enums.MaterialTypes;
import Interfaces.Playable;
import Interfaces.Saleable;

public class Keyboard extends Instrument {

    private int noOfKeys;
    private String demoSong;

    public Keyboard(String make, String model, MaterialTypes material, ColourTypes colour, InstrumentTypes type, double buyPrice, double sellPrice, int noOfKeys, String demoSong) {
        super(make, model, material, colour, type, buyPrice, sellPrice);
        this.noOfKeys = noOfKeys;
        this.demoSong = demoSong;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }

    public String getDemoSong() {
        return demoSong;
    }

    public String play() {
        return "Plinky plonk";
    }
}

