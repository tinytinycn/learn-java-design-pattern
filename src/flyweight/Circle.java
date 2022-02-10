package flyweight;

/**
 * 圆形类
 * 具体享元类 concreteFlyweight
 */
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    // 可以设置外部状态， 获得不同的实例
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("圆形: draw() [" + color + ", x:" + x + ", y:" + y + ", color:" + color);
    }
}
