package factory.simplefactory;

public class SimpleFactory {
    public Product createProduct(String type) {
        Product product = null;
        if (type.equals("A")) {
            return new ConcreteProductA();
        } else if (type.equals("B")) {
            return new ConcreteProductB();
        }
        return null;
    }
}
