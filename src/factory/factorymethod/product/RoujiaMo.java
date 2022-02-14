package factory.factorymethod.product;

public abstract class RoujiaMo {
    protected  String name;

    public void prepare() {
        System.out.println("准备工作");
    }

    public void fire() {
        System.out.println("烹饪");
    }

    public void pack() {
        System.out.println("打包");
    }
}
