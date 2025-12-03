package command;

public class CancelOrderCommand implements OrderCommand {
    private int orderId;

    public CancelOrderCommand(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public void execute() {
        System.out.println("Order " + orderId + " has been cancelled.");
    }
}
