package designPattern.structuralPattern.Decorator;

public class ConcreteDecoratorB extends Decorator {
    private Component component;
    public ConcreteDecoratorB(Component component) {
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
