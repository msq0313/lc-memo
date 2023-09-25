package designPattern.structuralPattern.Adapter;

public class Adapter extends Target {
    Adaptee adaptee;

    public Adapter() {
        adaptee = new Adaptee();
    }

    @Override
    public void request(int a) {
        adaptee.specificRequest(String.valueOf(a));
    }
}
