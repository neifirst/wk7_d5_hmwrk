package Locations;

import Instruments.Flute;
import Interfaces.Saleable;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Saleable> stock;
    private double profit;
    DecimalFormat format = new DecimalFormat("#.00");

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.profit = 0.00;
    }

    public int countStock() {
        return this.stock.size();
    }

    public void addStockItem(Saleable item) {
        stock.add(item);
    }

    public void removeStockItem(Saleable item) {
        stock.remove(item);
    }

    public double calculateTotalProfit() {
        for (Saleable item : stock) {
            profit += Double.parseDouble(format.format(item.calculateMarkup()));
        }
        return profit;
    }

}
