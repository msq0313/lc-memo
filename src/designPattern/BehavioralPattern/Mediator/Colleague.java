package designPattern.BehavioralPattern.Mediator;

public abstract class Colleague {
    public Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMsg(String code, String msg) {
        System.out.printf("%s sendMsg\n", this.getClass().getSimpleName());
        this.mediator.operation(code, msg);
    }

    public void receiveMsg(String msg) {
        System.out.printf("%s receiveMsg %s\n", this.getClass().getSimpleName(), msg);
    }
}
