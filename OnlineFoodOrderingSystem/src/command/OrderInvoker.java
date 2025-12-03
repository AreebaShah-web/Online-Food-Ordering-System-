package command;

public class OrderInvoker {
    private OrderCommand command;

    public void setCommand(OrderCommand command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}

