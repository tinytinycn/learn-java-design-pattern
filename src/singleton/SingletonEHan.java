package singleton;

/**
 * 饿汉-单例模式
 * - 私有化构造器
 * - 在当前类new一个当前类的对象
 * - 定义一个共有方法，返回对象
 */
public class SingletonEHan {
    private SingletonEHan() {
    }

    private static SingletonEHan instance = new SingletonEHan();

    public static SingletonEHan getInstance() {
        return instance;
    }
}
