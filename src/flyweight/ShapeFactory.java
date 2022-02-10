package flyweight;

import java.util.HashMap;

/**
 * 图形工厂类
 * 享元工厂类 flyweight factory
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();

    public static Shape getShape(String color) {
        Shape shape = circleMap.get(color);
        if (shape == null) {
            shape = new Circle(color);
            circleMap.put(color, shape);
            System.out.println("创建一个圆形");
        }
        // 返回缓存中的圆形，并使用了内部状态color
        return shape;
    }
}
