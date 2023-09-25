package designPattern.BehavioralPattern.Command;

public class Receiver {
    public void open() {
        System.out.printf("%s open\n", this.getClass().getSimpleName());
    }

    public void close() {
        System.out.printf("%s close\n", this.getClass().getSimpleName());
    }
}
