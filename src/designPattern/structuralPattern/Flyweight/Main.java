package designPattern.structuralPattern.Flyweight;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        ConcreteFlyweight one = flyweightFactory.getFlyweight("one");
        one.operation();
        ConcreteFlyweight two = flyweightFactory.getFlyweight("two");
        two.operation();
        ConcreteFlyweight one2 = flyweightFactory.getFlyweight("one");
        one2.operation();
    }
}
