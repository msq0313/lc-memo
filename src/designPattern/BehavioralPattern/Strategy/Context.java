package designPattern.BehavioralPattern.Strategy;

public class Context {
    Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void call() {
        System.out.printf("%s call()\n", this.getClass().getSimpleName());
        strategy.call();
    }
}
