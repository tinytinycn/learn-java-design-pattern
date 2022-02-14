package factory.abstractfactory;

import factory.abstractfactory.factory.XianRoujiaMoFactory;
import factory.abstractfactory.factory.XianYLFactory;
import factory.abstractfactory.product.roujiamo.RoujiaMo;

public class XianRoujiaMoStore extends RoujiaMoStore {

    private XianRoujiaMoFactory factory;

    public XianRoujiaMoStore(XianRoujiaMoFactory factory) {
        this.factory = factory;
    }

    @Override
    public RoujiaMo sellerRoujiaMo(String type) {
        RoujiaMo roujiaMo = factory.createRoujiaMo(type);
        roujiaMo.prepare(new XianYLFactory());
        roujiaMo.fire();
        roujiaMo.pack();
        return roujiaMo;
    }
}
