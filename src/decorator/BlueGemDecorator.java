package decorator;

/**
 * 武器装备装饰类的实现类
 */
public class BlueGemDecorator implements IEquipDecorator {

    private IEquip iEquip;

    // 传入被装饰或扩展功能的对象引用
    public BlueGemDecorator(IEquip iEquip) {
        this.iEquip = iEquip;
    }


    @Override
    public int caculateAttack() {
        // 增加攻击力值
        return 5 + iEquip.caculateAttack();
    }

    @Override
    public String description() {
        // 装备蓝宝石
        return iEquip.description() + "并配备了蓝宝石";
    }
}
