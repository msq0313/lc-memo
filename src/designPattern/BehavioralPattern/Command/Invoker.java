package designPattern.BehavioralPattern.Command;

public class Invoker {
    public Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.printf("%s call\n",this.getClass().getSimpleName());
        command.execute();
    }
}
