package factory.abstractfactory.factory;

import factory.abstractfactory.product.roujiamo.RoujiaMo;
import factory.abstractfactory.product.roujiamo.XianRoujiaMo;

public class XianRoujiaMoFactory {
    public RoujiaMo createRoujiaMo(String type) {
        RoujiaMo roujiaMo = null;
        if (type.equals("xian")) {
            roujiaMo = new XianRoujiaMo();
        } else {
            //roujiaMo = new ChangshaRoujiaMo();
        }
        return roujiaMo;
    }
}
