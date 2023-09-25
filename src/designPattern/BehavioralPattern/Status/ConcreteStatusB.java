package designPattern.BehavioralPattern.Status;

public class ConcreteStatusB extends Status{
    public ConcreteStatusB() {
        setName("statusB");
    }

    @Override
    public void handle(Context ctx) {
        Status statusA = new ConcreteStatusA();
        ctx.changeStatus(statusA);
    }
}
