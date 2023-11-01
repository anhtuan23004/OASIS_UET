public abstract class Circle {
    private double radius;
    private String color;
    protected static final double PI = 3.14;

    public Circle() {
    }

    /**
     * returns the radius of the circle.
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * returns the radius, color of the circle.
     * @param radius the radius of the circle
     * @param color the color of the circle
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Constructor override.
     * @return string
     */
    @Override
    public String toString() {
        return "Circle["
                + "radius=" + radius
                + ",color='" + color + '\''
                + ']';
    }

    /**
     * Constructor calculate the area of the circle.
     * @return area
     */
    public double getArea() {
        return PI * radius * radius;
    }
}
