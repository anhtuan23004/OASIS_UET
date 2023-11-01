public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /**
     * Construct a new Circle.
     * @param center the center of the circle
     * @param radius the radius of the circle
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return PI * 2 * radius;
    }

    /**
     * Prints Info.
     * @return string
     */
    @Override
    public String getInfo() {
        return "Circle[("
                + String.format("%.2f", center.getPointX()) + ","
                + String.format("%.2f", center.getPointY()) + "),"
                + "r=" + String.format("%.2f", radius) + "]";
    }
}
