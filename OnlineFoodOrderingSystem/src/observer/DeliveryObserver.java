package observer;

public class DeliveryObserver implements Observer {

    @Override
    public void update(String message) {
        System.out.println("[Delivery Notification] " + message);
    }
}
