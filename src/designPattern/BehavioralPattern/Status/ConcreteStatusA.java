package designPattern.BehavioralPattern.Status;

public class ConcreteStatusA extends Status{
    public ConcreteStatusA() {
        setName("statusA");
    }
    @Override
    public void handle(Context ctx) {
        Status statusB = new ConcreteStatusB();
        ctx.changeStatus(statusB);
    }
}
