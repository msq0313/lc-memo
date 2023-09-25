package designPattern.BehavioralPattern.Command;

public class ConcreteCommandClose extends Command {
    public ConcreteCommandClose(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        System.out.printf("%s execute\n", this.getClass().getSimpleName());
        receiver.close();
    }
}
