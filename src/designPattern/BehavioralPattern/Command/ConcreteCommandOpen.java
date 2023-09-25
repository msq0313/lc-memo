package designPattern.BehavioralPattern.Command;

public class ConcreteCommandOpen extends Command {
    public ConcreteCommandOpen(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        System.out.printf("%s\n", this.getClass().getSimpleName());
        receiver.open();
    }
}
