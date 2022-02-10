package bridge;

/**
 * 画板客户类Client
 */
public class PanelClient {

    public void drawMore() {
        // 画红色圆圈
        Circle circle = new Circle(10, 100, 100, new RedCircle());
        circle.draw();
        // 画绿色圆圈
        Circle circle2 = new Circle(20, 200, 200, new GreenCircle());
        circle2.draw();
    }
}
