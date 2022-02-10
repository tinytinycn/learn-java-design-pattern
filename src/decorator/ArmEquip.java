package decorator;

/**
 * 武器装备实现类
 */
public class ArmEquip implements IEquip {
    @Override
    public int caculateAttack() {
        return 20;
    }

    @Override
    public String description() {
        return "手备装备";
    }
}
