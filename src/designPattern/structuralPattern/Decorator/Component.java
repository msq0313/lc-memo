package designPattern.structuralPattern.Decorator;

public class Component {
    public void operate() {
        System.out.printf("%s operate\n", this.getClass().getSimpleName());
    }
}
