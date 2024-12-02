package Nivell2.Modules.Observer;

public interface MyObservable {

    void subscribe(MyObserver observer);

    void unsubscribe(MyObserver observer);

    void broadcast(String marketName, String status, double index);
}
