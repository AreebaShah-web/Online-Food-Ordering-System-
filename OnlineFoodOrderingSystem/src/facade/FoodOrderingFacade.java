package facade;

import command.*;
import menu.*;
import observer.*;

public class FoodOrderingFacade {

    MenuCategory mainMenu = new MenuCategory("Main Menu");
    OrderInvoker invoker = new OrderInvoker();
    OrderSubject orderSubject = new OrderSubject();

    private static int ORDER_COUNTER = 1;

    public FoodOrderingFacade() {
        // Observers
        orderSubject.attach(new RestaurantObserver());
        orderSubject.attach(new DeliveryObserver());

        // Menu Build (Composite)
        MenuCategory fastFood = new MenuCategory("Fast Food");
        fastFood.add(new MenuItem("Burger", 5.5));
        fastFood.add(new MenuItem("Fries", 2.0));

        MenuCategory drinks = new MenuCategory("Drinks");
        drinks.add(new MenuItem("Coke", 1.5));
        drinks.add(new MenuItem("Juice", 2.2));

        mainMenu.add(fastFood);
        mainMenu.add(drinks);
    }

    public void browseMenu() {
        mainMenu.display();
    }

    public void placeOrder(String user, String[] items) {
        int orderId = ORDER_COUNTER++;
        invoker.setCommand(new PlaceOrderCommand(user, items));
        invoker.execute();

        orderSubject.notifyAllObservers("New Order Received: ID " + orderId);
    }

    public void trackOrder(int orderId) {
        System.out.println("Order " + orderId + " is being prepared...");
    }
}
