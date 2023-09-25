package designPattern.creationalPattern.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        // 各工厂代表不同品牌，产品编号代表不同产品种类
        // 工厂1生产产品A和B
        Factory f1 = new ConcreteFactory1();
        ProductA a1 = f1.createProductA();
        a1.use();
        ProductB b1 = f1.createProductB();
        b1.eat();
        // 工厂2生产产品A和B
        Factory f2 = new ConcreteFactory2();
        ProductA a2 = f2.createProductA();
        a2.use();
        ProductB b2 = f2.createProductB();
        b2.eat();
    }
}
