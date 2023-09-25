package designPattern.creationalPattern.Singleton;

/**
 * 懒汉式线程不安全
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void operation() {
        System.out.printf("%s operation\n", this.getClass().getSimpleName());
    }
}
