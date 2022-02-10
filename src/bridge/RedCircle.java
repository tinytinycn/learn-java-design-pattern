package bridge;

/**
 * 具体实现类
 */
public class RedCircle implements DrawColorCircleImplementor {
    @Override
    public void drawColorCircle(int r, int x, int y) {
        // 封装颜色纬度的变化
        System.out.println("开始画红色圆圈");
    }
}
