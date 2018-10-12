public class Circle {
    private double radius;
    private static int count;

    public Circle(double radius) {
        setRadius(radius);
        count++;
    }
    public double getRadius() {
        return radius;
    }
    public static int getCount() {
        return count;
    }
    private void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }else {
            throw new IllegalArgumentException("Invalid Radius");
        }
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    public double getCircumference(){
        return 2*this.radius*Math.PI;
    }
}