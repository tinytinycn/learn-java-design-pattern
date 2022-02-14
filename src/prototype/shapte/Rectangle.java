package prototype.shapte;

public class Rectangle extends Shape{

    public Rectangle() {
        this.type = "rectangle";
    }

    @Override
    public void draw() {
        System.out.println("调用了rectangle draw()方法");
    }
}
