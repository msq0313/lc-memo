package designPattern.creationalPattern.Singleton;

/**
 * 懒汉式线程安全
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {

    }

    /**
     * 性能低，大部分情况下并不用同步
     * @return
     */
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    public void operation() {
        System.out.printf("%s operation\n", this.getClass().getSimpleName());
    }
}
