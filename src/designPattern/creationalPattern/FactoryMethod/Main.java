package designPattern.creationalPattern.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Factory f = new ConcreteFactoryA();
        Product p = f.createProduct();
        p.use();
        Factory fb = new ConcreteFactoryB();
        Product pb = fb.createProduct();
        pb.use();
        ConcreteFactoryC fc = new ConcreteFactoryC();
        fc.printClassName();
    }
}
