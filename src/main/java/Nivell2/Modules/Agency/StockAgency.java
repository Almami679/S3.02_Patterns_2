package Nivell2.Modules.Agency;

import Nivell2.Modules.StockMarket.StockMarket;

public abstract class StockAgency {

    private String name;

    public StockAgency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public StockAgency setName(String name) {
        this.name = name;
        return this;
    }

    public abstract void receiveInformation(String marketName, String status, double index);
}
