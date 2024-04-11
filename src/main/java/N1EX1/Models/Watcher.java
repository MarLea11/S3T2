package N1EX1.Models;

import N1EX1.Models.Interfaces.Observer;

public class Watcher implements Observer {

    private final String name;

    public Watcher(String name) {
        this.name = name;
    }

    public void update(double stockStatus) {

        System.out.println("The new stock status value is: " + stockStatus + ". Thank you for your subscription " + name);
    }

    public String getName() {
        return name;
    }

}
