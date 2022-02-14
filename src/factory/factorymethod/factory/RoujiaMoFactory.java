package factory.factorymethod.factory;

import factory.factorymethod.product.LaRoujiaMo;
import factory.factorymethod.product.RoujiaMo;
import factory.factorymethod.product.XianRoujiaMo;

/**
 * 具体工厂类
 * - 将产品类的实例化操作延迟到工厂子类中完成
 */
public class RoujiaMoFactory {
    public RoujiaMo createRoujiaMo(String type) {
        RoujiaMo roujiaMo = null;
        if (type.equals("la")) {
            roujiaMo = new LaRoujiaMo();
        } else {
            roujiaMo = new XianRoujiaMo();
        }
        return roujiaMo;
    }
}
