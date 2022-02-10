package bridge;

/**
 * 图形shape抽象类
 */
public abstract class ShapeAbstraction {
    protected DrawColorCircleImplementor drawCircleImplementor;

    // 聚合Implementor
    protected ShapeAbstraction(DrawColorCircleImplementor drawCircleImplementor) {
        this.drawCircleImplementor = drawCircleImplementor;
    }

    // 将扩展的部分，放到具体实现类中实现，例如描绘颜色color
    public abstract void draw();
}
