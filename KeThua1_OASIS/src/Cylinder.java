public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    /**
     * returns the height of the cylinder.
     * @param height the height of the cylinder
     */
    public Cylinder(double height) {
        this.height = height;
    }

    /**
     * Returns the height and the radius of the cylinder.
     * @param radius the radius of the cylinder
     * @param height the height of the cylinder
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Returns the height, the radius, the color of the cylinder.
     * @param radius the radius of the cylinder
     * @param height the height of the cylinder
     * @param color the color of the cylinder
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    /**
     * Constructor override.
     * @return string cylinder
     */
    @Override
    public String toString() {
        return "Cylinder["
                + super.toString()
                + ",height=" + height
                + ']';
    }

    /**
     * Constructor calculate the area of the cylinder.
     * @return area
     */
    @Override
    public double getArea() {
        return 2 * (super.getArea() + PI * super.getRadius() * height);
    }
}
