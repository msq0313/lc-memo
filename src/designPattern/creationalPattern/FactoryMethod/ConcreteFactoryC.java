package designPattern.creationalPattern.FactoryMethod;

public class ConcreteFactoryC extends Factory {
    public void printClassName() {
        System.out.printf("%s\n", this.getClass().getSimpleName());
    }
}
