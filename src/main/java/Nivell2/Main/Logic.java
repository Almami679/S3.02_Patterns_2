package Nivell2.Main;


import Nivell2.Modules.Agency.Broker;
import Nivell2.Modules.Agency.StockAgency;
import Nivell2.Modules.StockMarket.StockMarket;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Logic {

    private static final StockMarket MARKET = new StockMarket("IBEX 35");
    private static final ArrayList<Broker> BROKERS = new ArrayList<>();

    private static int NUMREPEATS = 4;

    public static void start()  {

        BROKERS.add(new Broker("PacoStacks"));
        BROKERS.add(new Broker("Barna Gest"));

        MARKET.subscribe(BROKERS.get(0));
        MARKET.subscribe(BROKERS.get(1));

        MARKET.marketFluctuation();



        while(NUMREPEATS != 0) {
            try {
                System.out.println("waiting for update DATA");
                sleep(2000);
                MARKET.marketFluctuation();
            } catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
            NUMREPEATS--;
        }












    }
}
