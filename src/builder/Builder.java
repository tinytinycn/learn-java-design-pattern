package builder;

public abstract class Builder {
    public abstract void buildPart(String name, String type);

    public abstract Product getProduct();
}
