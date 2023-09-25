package designPattern.structuralPattern.Decorator;

public class Main {
    public static void main(String[] args) {
        // 客户端可以控制到底使用哪个装饰器
        Component component = new ConcreteComponent();
        Decorator concreteDecoratorA = new ConcreteDecoratorA(component);
        concreteDecoratorA.operate();
        Decorator concreteDecoratorB = new ConcreteDecoratorB(component);
        concreteDecoratorB.operate();
    }
}