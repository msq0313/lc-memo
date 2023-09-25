package designPattern.creationalPattern.AbstractFactory;

public class ConcreteFactory1 extends Factory {
    @Override
    protected ProductA createProductA() {
        return new ConcreteProductA1();
    }
    @Override
    protected ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
