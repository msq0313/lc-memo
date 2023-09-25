package designPattern.BehavioralPattern.Strategy;

public class Main {
    public static void main(String[] args) {
        Context ctx = new Context();
        ConcreteStrategyA concreteStrategyA = new ConcreteStrategyA();
        ctx.setStrategy(concreteStrategyA);
        ctx.call();
        ConcreteStrategyB concreteStrategyB = new ConcreteStrategyB();
        ctx.setStrategy(concreteStrategyB);
        ctx.call();
    }
}
