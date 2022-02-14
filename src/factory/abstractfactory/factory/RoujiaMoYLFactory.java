package factory.abstractfactory.factory;

import factory.abstractfactory.product.meet.Meet;
import factory.abstractfactory.product.yuanliao.YuanLiao;

public interface RoujiaMoYLFactory {
    /**
     * 生产肉
     */
    public Meet creatMeet();

    /**
     * 生产一些原料
     */
    public YuanLiao creatYuanLiao();
}
