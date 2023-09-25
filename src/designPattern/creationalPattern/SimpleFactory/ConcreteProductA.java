package designPattern.creationalPattern.SimpleFactory;

public class ConcreteProductA extends Product {
    @Override
    public void use() {
        super.use();
        System.out.printf("use %s\n", this.getClass().getSimpleName());
    }
}
