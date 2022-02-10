package bridge;

/**
 * 桥接实现接口
 * 封装颜色color变化
 */
public interface DrawColorCircleImplementor {
    // r半径 x,y坐标
    void drawColorCircle(int r, int x, int y);
}
