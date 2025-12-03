import facade.FoodOrderingFacade;
import menu.*;

public class Main {
    public static void main(String[] args) {

        FoodOrderingFacade api = new FoodOrderingFacade();

        System.out.println("\n===== MENU =====");
        api.browseMenu();

        System.out.println("\n===== PLACE ORDER =====");
        api.placeOrder("Customer12", new String[]{"Burger", "Fries"});

        System.out.println("\n===== TRACK ORDER =====");
        api.trackOrder(1);
    }
}
