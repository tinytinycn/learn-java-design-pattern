package factory.factorymethod;

import factory.factorymethod.product.RoujiaMo;

/**
 * 抽象工厂
 */
public abstract class RoujiaMoStore {
    // 工厂方法：销售肉夹馍
    public abstract RoujiaMo sellRoujiaMo(String type);
}
