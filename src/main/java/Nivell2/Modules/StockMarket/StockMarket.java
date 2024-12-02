package Nivell2.Modules.StockMarket;

import Nivell2.Modules.Observer.MyObservable;
import Nivell2.Modules.Observer.MyObserver;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements MyObservable {

    private List<MyObserver> observers = new ArrayList<>();
    private String name;
    private String status;
    private double index;

    public StockMarket(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public double getIndex() {
        return index;
    }

    public StockMarket setStatus(String status) {
        this.status = status;
        return this;
    }

    public StockMarket setIndex(double index) {
        this.index = index;
        return this;
    }

    public void marketFluctuation() {
        this.status = (Math.random() < 0.5)?"+ " : "- ";
        this.index = Math.random()*6;
        this.broadcast(this.name, this.status, this.index);

    }

    @Override
    public void subscribe(MyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(MyObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void broadcast(String marketName, String status, double index) {
        observers.forEach(observer -> observer.update(marketName, status, index));
    }


}
