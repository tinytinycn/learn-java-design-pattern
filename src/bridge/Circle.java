package bridge;

/**
 * 扩充类
 */
public class Circle extends ShapeAbstraction {

    private int x, y, r;

    // 聚合Implementor
    protected Circle(int r, int x, int y, DrawColorCircleImplementor drawCircleImplementor) {
        super(drawCircleImplementor);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw() {
        drawCircleImplementor.drawColorCircle(r, x, y);
    }
}
