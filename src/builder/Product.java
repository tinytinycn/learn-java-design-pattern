package builder;

public class Product {
    private String name;
    private String type;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showProduct() {
        System.out.println("名称：" + name + ", 型号：" + type);
    }
}
