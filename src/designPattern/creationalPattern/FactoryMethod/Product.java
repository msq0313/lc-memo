package designPattern.creationalPattern.FactoryMethod;

public abstract class Product {
    protected void use() {
        System.out.printf("use %s\n", this.getClass().getSimpleName());
    }
}
