package designPattern.BehavioralPattern.Strategy;

public abstract class Strategy {

    void call() {
        System.out.printf("%s call()\n", this.getClass().getSimpleName());
    }
}
