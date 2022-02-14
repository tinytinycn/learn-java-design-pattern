package prototype.shapte;

public class Circle extends Shape{
    public Circle() {
        this.type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("调用了circle draw()方法");
    }
}
