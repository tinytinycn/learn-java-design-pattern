package decorator;

public class FightClient {
    public void fight() {
        IEquip blueGemArmEquip = new BlueGemDecorator(new ArmEquip());
        System.out.println("攻击力-" + blueGemArmEquip.caculateAttack() + ", 描述-" + blueGemArmEquip.description());
    }
}
