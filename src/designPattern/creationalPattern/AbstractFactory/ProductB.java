package designPattern.creationalPattern.AbstractFactory;

public abstract class ProductB extends Product {
    protected void eat() {
        System.out.printf("eat %s\n", this.getClass().getSimpleName());
    }
}
