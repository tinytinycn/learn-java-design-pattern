package singleton;

/**
 * 懒汉-单例模式
 * - 延迟创建对象的时机
 * - 线程安全
 */
public class SingletonLanHan {
    private SingletonLanHan() {
    }

    private static SingletonLanHan instance = null;

    public static SingletonLanHan getInstance() {
        if (instance == null) {
            synchronized (SingletonLanHan.class) {
                if (instance == null) {
                    instance = new SingletonLanHan();
                }
            }
        }
        return instance;
    }
}
