package designPattern.structuralPattern.Adapter;

public class Adaptee {
    public void specificRequest(String s) {
        System.out.printf("specificRequest %s\n", s);
    }
}
