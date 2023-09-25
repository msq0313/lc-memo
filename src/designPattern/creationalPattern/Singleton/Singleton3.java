package designPattern.creationalPattern.Singleton;

/**
 * 饿汉式，非lazy loading，线程安全
 */
public class Singleton3 {
    private static Singleton3 singleton3 = new Singleton3();

    private Singleton3() {

    }

    public Singleton3 getInstance() {
        return singleton3;
    }
}
