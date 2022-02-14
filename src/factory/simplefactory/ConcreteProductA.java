package factory.simplefactory;

public class ConcreteProductA implements Product{
    @Override
    public void use() {
        System.out.println("产品A");
    }
}
