package designPattern.creationalPattern.SimpleFactory;

import java.util.Objects;

public class Factory {
    public Product createProduct(String param) {
        if (Objects.equals(param, "A")) {
            return new ConcreteProductA();
        } else if (Objects.equals(param, "B")) {
            return new ConcreteProductB();
        } else {
            return null;
        }
    }
}
