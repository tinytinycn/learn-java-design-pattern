package decorator;

/**
 * 装备接口类 Component抽象类
 */
public interface IEquip {

    // 计算攻击力
    public int caculateAttack();

    // 装备描述
    public String description();
}
