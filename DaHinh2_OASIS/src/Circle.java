import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

    public Circle() {
    }

    /**
     * Constructs a Circle with the specified radius.
     *
     * @param radius The radius of the Circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructs a Circle.
     *
     * @param radius The radius of the Circle.
     * @param color The color of the Circle.
     * @param filled The fill status of the Circle.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Constructs a Circle.
     *
     * @param center The center of the Circle.
     * @param radius The radius of the Circle.
     * @param color The color of the Circle.
     * @param filled The fill status of the Circle.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
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

    /**
     * Returns the area of the Circle, calculated using its radius.
     *
     * @return The area of the Circle.
     */
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Returns the pew of the Circle, calculated using its radius.
     *
     * @return The pew of the Circle.
     */
    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Compares this Circle to the specified Object for equality.
     *
     * @param obj the Object to compare to.
     * @return true if the specified Object is a Circle and
     * has the same radius and center as this Circle, false otherwise.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return radius == other.radius && center.equals(other.center);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius(), getCenter());
    }

    /**
     * Returns a string of the Circle, radius, center, color, center and fill status.
     *
     * @return A string representation of the Circle.
     */
    @Override
    public String toString() {
        return "Circle[center=(" + getCenter().getPointX() + "," + getCenter().getPointY()
                + "),radius=" + radius + ",color=" + color + ",filled=" + filled + "]";
    }
}
