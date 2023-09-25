package designPattern.structuralPattern.Decorator;

public class ConcreteDecoratorA extends Decorator {
    private Component component;
    public ConcreteDecoratorA(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
        addBehavior();
    }

    @Override
    public void addBehavior() {
        super.addBehavior();
    }
}
