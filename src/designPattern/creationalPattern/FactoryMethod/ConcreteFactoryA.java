package designPattern.creationalPattern.FactoryMethod;

public class ConcreteFactoryA extends Factory{
    @Override
    protected Product createProduct() {
        return new ConcreteProductA();
    }
}
