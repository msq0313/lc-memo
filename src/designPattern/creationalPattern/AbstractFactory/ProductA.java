package designPattern.creationalPattern.AbstractFactory;

public abstract class ProductA extends Product {
    protected void use() {
        System.out.printf("use %s\n", this.getClass().getSimpleName());
    }
}
