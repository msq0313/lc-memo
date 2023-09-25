package designPattern.creationalPattern.SimpleFactory;

public abstract class Product {
    public void use() {
        System.out.printf("use %s\n", this.getClass().getSimpleName());
    }
}
