package designPattern.creationalPattern.FactoryMethod;

public class ConcreteFactoryB extends Factory {
    @Override
    protected Product createProduct() {
        return new ConcreteProductB();
    }
}
