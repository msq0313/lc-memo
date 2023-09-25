package designPattern.creationalPattern.AbstractFactory;

public class ConcreteFactory2 extends Factory {
    @Override
    protected ProductA createProductA() {
        return new ConcreteProductA2();
    }

    protected ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
