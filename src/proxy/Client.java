package proxy;

public class Client {
    public static void main(String[] args) {
        // 创建代理对象，内部拥有一个世纪对象的引用
        Image proxyImage = new ProxyImage("test.png");
        // 操作代理对象，第一次调用，new 一个实际对象，间接使用实际对象的display()方法
        proxyImage.display();
        // 操作代理对象，第二次调用，复用实际对象
        proxyImage.display();
    }
}
