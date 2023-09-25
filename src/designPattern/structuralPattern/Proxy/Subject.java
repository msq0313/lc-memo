package designPattern.structuralPattern.Proxy;

public abstract class Subject {
    public void request() {
        System.out.printf("%s request\n", this.getClass().getSimpleName());
    }
}
