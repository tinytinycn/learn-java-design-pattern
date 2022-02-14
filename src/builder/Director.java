package builder;

public class Director {
    private Builder builder = new ConcreteBuilder();

    public Product getProductA() {
        builder.buildPart("tesla", "3");
        return builder.getProduct();
    }

    public Product getProductB() {
        builder.buildPart("tesla", "y");
        return builder.getProduct();
    }
}
