package designPattern.structuralPattern.Proxy;

public class Proxy extends Subject {
    private RealSubject realSubject;

    public Proxy() {
        realSubject = new RealSubject();
    }

    private void preRequest() {
        System.out.printf("%s preRequest\n", this.getClass().getSimpleName());
    }

    private void afterRequest() {
        System.out.printf("%s afterRequest\n", this.getClass().getSimpleName());
    }

    @Override
    public void request() {
        preRequest();
        realSubject.request();
        afterRequest();
    }
}
