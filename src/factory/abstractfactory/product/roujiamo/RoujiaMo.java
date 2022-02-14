package factory.abstractfactory.product.roujiamo;

import factory.abstractfactory.factory.RoujiaMoYLFactory;
import factory.abstractfactory.product.meet.Meet;
import factory.abstractfactory.product.yuanliao.YuanLiao;

public abstract class RoujiaMo {
    protected String name;

    /**
     * 准备工作
     */
    public void prepare(RoujiaMoYLFactory roujiaMoYLFactory) {
        Meet meet = roujiaMoYLFactory.creatMeet();
        YuanLiao yuanLiao = roujiaMoYLFactory.creatYuanLiao();

        System.out.println("---RoujiaMo:使用官方的原料 ---" + name + ": 揉面-剁肉-完成准备工作 yuanLiao:" + meet + "yuanLiao:" + yuanLiao);
    }

    /**
     * 秘制设备--烘烤2分钟
     */
    public void fire() {
        System.out.println("---RoujiaMo:" + name + ": 肉夹馍-专用设备-烘烤");
    }

    /**
     * 使用你们的专用袋-包装
     */
    public void pack() {
        System.out.println("---RoujiaMo:" + name + ": 肉夹馍-专用袋-包装---end");
    }
}
