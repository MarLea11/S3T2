package N1EX1.Models;

import N1EX1.Models.Interfaces.Notifier;
import N1EX1.Models.Interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class Broker implements Notifier {

    private final List<Observer> observers;
    private double stockStatus;

    public Broker() {
        observers = new ArrayList<>();
        stockStatus = 0.0;
    }

    public void notifyObservers() {

        for(Observer observer:observers) {
            observer.update(stockStatus);
        }

    }

    public void setStockStatus(double stockStatus){
        if(this.stockStatus != stockStatus || this.stockStatus > 0) {
            this.stockStatus = stockStatus;
            notifyObservers();
        } else {
            System.err.println("Invalid stock status value");
        }
    }

    @Override
    public void subscribeObserver(Observer watcher) {
        observers.add(watcher);
    }

    @Override
    public void unsubscribeObserver(Observer watcher) {
        observers.remove(watcher);
    }
}
