public class Cylinder {
    private Circle circle;
    private Rectangle rectangle;

    public Cylinder(Circle circle, Rectangle rectangle) {
        super();
        this.circle = circle;
        this.rectangle = rectangle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
}
