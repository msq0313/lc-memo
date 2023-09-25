package designPattern.creationalPattern.SimpleFactory;

public class ConcreteProductB extends Product {
    @Override
    public void use() {
        super.use();
        System.out.printf("use %s\n", this.getClass().getSimpleName());
    }
}
