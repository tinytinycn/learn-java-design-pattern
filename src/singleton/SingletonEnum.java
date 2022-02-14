package singleton;

/**
 * 枚举-单例模式
 * - 借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 */
public enum SingletonEnum {
    instance;

    SingletonEnum() {
        System.out.println("singletonEnum constructor" + this.hashCode());
    }

}

class A {
    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.instance;
    }
}