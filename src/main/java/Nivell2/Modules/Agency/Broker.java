package Nivell2.Modules.Agency;

import Nivell2.Modules.Observer.MyObserver;

public class Broker extends StockAgency implements MyObserver {

    public Broker(String name) {
        super(name);

    }

    @Override
    public void receiveInformation(String marketName, String status, double index) {
        String output;
        if(status.equalsIgnoreCase("- ")){
            output = "send to " + this.getName() + "\n - " + marketName + " stock market is down (" +
                    status + index + "%)";
        } else {
            output = "send to " + this.getName() + "\n - " + marketName + " stock market is up (" +
                    status + index + "%)";
        }
        System.out.println(output);
    }


    @Override
    public void update(String marketName, String status, double index) {
        receiveInformation(marketName, status, index);
    }
}
