package builder;

public class ConcreteBuilder extends Builder {

    private Product product;

    @Override
    public void buildPart(String name, String type) {
        // 建造者隐藏构建对象的内部细节
        product.setName(name);
        product.setType(type);
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
