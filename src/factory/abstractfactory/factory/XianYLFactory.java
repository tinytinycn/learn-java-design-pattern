package factory.abstractfactory.factory;

import factory.abstractfactory.product.meet.Meet;
import factory.abstractfactory.product.meet.XianMeet;
import factory.abstractfactory.product.yuanliao.XianYuanLiao;
import factory.abstractfactory.product.yuanliao.YuanLiao;

public class XianYLFactory implements RoujiaMoYLFactory {
    @Override
    public Meet creatMeet() {
        return new XianMeet();
    }

    @Override
    public YuanLiao creatYuanLiao() {
        return new XianYuanLiao();
    }
}
