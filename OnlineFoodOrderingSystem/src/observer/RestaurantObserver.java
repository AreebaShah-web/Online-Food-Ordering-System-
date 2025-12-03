package observer;

public class RestaurantObserver implements Observer {

    @Override
    public void update(String message) {
        System.out.println("[Restaurant Notification] " + message);
    }
}

