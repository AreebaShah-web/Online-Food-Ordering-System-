package observer;

import java.util.ArrayList;
import java.util.List;

public class OrderSubject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer obs) {
        observers.add(obs);
    }

    public void notifyAllObservers(String msg) {
        for (Observer obs : observers) {
            obs.update(msg);
        }
    }
}
