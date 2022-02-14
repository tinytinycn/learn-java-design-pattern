package factory.abstractfactory.factory;

import factory.abstractfactory.product.meet.ChangshaMeet;
import factory.abstractfactory.product.meet.Meet;
import factory.abstractfactory.product.yuanliao.ChangshaYuanLiao;
import factory.abstractfactory.product.yuanliao.YuanLiao;

public class ChangshaYLFactory implements RoujiaMoYLFactory {
    @Override
    public Meet creatMeet() {
        return new ChangshaMeet();
    }

    @Override
    public YuanLiao creatYuanLiao() {
        return new ChangshaYuanLiao();
    }
}
