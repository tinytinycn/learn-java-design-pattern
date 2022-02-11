package strategy;

import strategy.strategy.IDisplayBehavior;

/**
 * 角色抽象类
 * 每个角色的不同动作都有可能发生变化，需要独立出来
 */
public abstract class RoleContext {
    // 角色名称
    protected String name;

    // 需要改变的行为策略
    private IDisplayBehavior iDisplayBehavior;

    public RoleContext setIDisplayBehavior(IDisplayBehavior iDisplayBehavior) {
        this.iDisplayBehavior = iDisplayBehavior;
        return this;
    }

    // 具体的行为放到具体策略类中实现
    public void display() {
        iDisplayBehavior.display();
    }
}
