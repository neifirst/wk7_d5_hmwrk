package Enums;

import Interfaces.Saleable;

public enum ProductsTypes implements Saleable{

    DRUMSTICK(0.80,1.99),
    PLECTRUM(0.10, 1.10),
    SHEETMUSIC(2.50, 5.99),
    GUITARSTRING(6.20, 8.99),
    BRASSO(1.80, 4.99),
    AK47(300.00, 559.95);

    private double buyPrice;
    private double sellPrice;

    ProductsTypes(double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    @Override
    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
