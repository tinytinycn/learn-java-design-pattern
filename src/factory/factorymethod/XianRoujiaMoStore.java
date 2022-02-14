package factory.factorymethod;

import factory.factorymethod.factory.RoujiaMoFactory;
import factory.factorymethod.product.RoujiaMo;

public class XianRoujiaMoStore extends RoujiaMoStore{

    private RoujiaMoFactory factory;

    public XianRoujiaMoStore(RoujiaMoFactory factory) {
        this.factory = factory;
    }

    @Override
    public RoujiaMo sellRoujiaMo(String type) {
        // 1 使用工厂方法获得产品对象
        RoujiaMo roujiaMo = factory.createRoujiaMo(type);
        // 2 use()
        roujiaMo.prepare();
        roujiaMo.fire();
        roujiaMo.pack();
        return roujiaMo;
    }
}
