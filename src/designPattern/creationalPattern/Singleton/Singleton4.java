package designPattern.creationalPattern.Singleton;

/**
 * 双重校验锁，懒加载，线程安全，兼顾性能
 */
public class Singleton4 {
    /**
     * volatile禁止指令重排序，保证实例初始化完成再赋值
     * memory=allocate(); //1：分配内存空间
     * ctorInstance();   //2:初始化对象
     * singleton=memory; //3:设置singleton指向刚排序的内存空间
     */
    private volatile static Singleton4 instance;

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        // 因为大部分情况不需要同步，先判断一次是否需要new
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
