package singleton;

public class SingletonInner {
    private SingletonInner() {
    }

    private static class SingletonInHolder {
        static final SingletonInner instance = new SingletonInner();
    }

    public static SingletonInner getInstance() {
        return SingletonInHolder.instance;
    }
}
