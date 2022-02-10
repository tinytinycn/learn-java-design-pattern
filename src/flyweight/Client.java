package flyweight;

public class Client {
    public void getCircle() {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getShape("红色");
            circle.setX(i + 10);
            circle.setY(i + 20);
            circle.setRadius(i + 15);
            circle.draw();
        }
    }
}
