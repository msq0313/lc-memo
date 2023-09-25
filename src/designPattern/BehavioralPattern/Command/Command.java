package designPattern.BehavioralPattern.Command;

public abstract class Command {
    public Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }
    public void execute() {
        System.out.printf("%s execute\n", this.getClass().getSimpleName());
    }
}
