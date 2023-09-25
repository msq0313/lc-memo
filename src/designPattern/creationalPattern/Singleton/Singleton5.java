package designPattern.creationalPattern.Singleton;

/**
 * 静态内部类
 * 实现代码简洁。和双重检查单例对比，静态内部类单例实现代码真的是太简洁，又清晰明了。
 * 延迟初始化。调用getSingleton才初始化Singleton对象。
 * 线程安全。JVM在执行类的初始化阶段，会获得一个可以同步多个线程对同一个类的初始化的锁。
 */
public class Singleton5 {
    private static class Inner{
        private static Singleton5 singleton5 = new Singleton5();
    }

    private Singleton5() {

    }

    public Singleton5 getInstance() {
        return Inner.singleton5;
    }
}
