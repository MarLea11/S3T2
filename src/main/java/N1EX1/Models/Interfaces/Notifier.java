package N1EX1.Models.Interfaces;

public interface Notifier {

    void notifyObservers();
    void subscribeObserver(Observer watcher);
    void unsubscribeObserver(Observer watcher);

}
