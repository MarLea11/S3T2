package N1EX1;

import N1EX1.Models.Broker;
import N1EX1.Models.Watcher;

public class App {

    private App(){}

    public static void runProgram() {

        Broker broker = new Broker();

        Watcher watcher1 = new Watcher("Manuel");
        broker.subscribeObserver(watcher1);

        Watcher watcher2 = new Watcher("Marcos");
        broker.subscribeObserver(watcher2);

        Watcher watcher3 = new Watcher("Xavi");
        broker.subscribeObserver(watcher3);

        Watcher watcher4 = new Watcher("Joaquin");
        broker.subscribeObserver(watcher4);

        broker.setStockStatus(100.23);

        broker.unsubscribeObserver(watcher3);

        broker.setStockStatus(111.45);
    }

}
