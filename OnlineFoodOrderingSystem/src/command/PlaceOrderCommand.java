package command;

public class PlaceOrderCommand implements OrderCommand {
    private String user;
    private String[] items;

    public PlaceOrderCommand(String user, String[] items) {
        this.user = user;
        this.items = items;
    }

    @Override
    public void execute() {
        System.out.println("Order placed by " + user);
        for (String i : items) System.out.println(" - " + i);
    }
}
