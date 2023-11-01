import java.util.Objects;

public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

     public Rectangle() {
     }

     /**
     * Constructor.
     * @param width the width of the rectangle
     * @param length the height of the rectangle
     */
     public Rectangle(double width, double length) {
         this.width = width;
         this.length = length;
     }

     /**
     * Constructor.
     * @param width the width of the rectangle
     * @param length the height of the rectangle
     * @param color the color of the rectangle
     * @param filled fill the filled rectangle
     */
     public Rectangle(double width, double length, String color, boolean filled) {
         super(color, filled);
         this.width = width;
         this.length = length;
     }

     /**
     * Constructor.
     * @param topLeft the top left of the rectangle
     * @param width the width of the rectangle
     * @param length the length of the rectangle
     * @param color the color of the rectangle
     * @param filled fill rectangle
     */
     public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
         super(color, filled);
         this.topLeft = topLeft;
         this.width = width;
         this.length = length;
     }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * Compares this Rectangle to the specified Object for equality.
     *
     * @param obj the Object to compare to.
     * @return true if the specified Object is a Rectangle and has the same
     * width, length, and top left corner as this Rectangle, false otherwise.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return width == other.width && length == other.length
                    && topLeft.equals(other.topLeft);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width, length);
    }

    @Override
    public String toString() {
        return "Rectangle[" + "topLeft=" + topLeft
                + ",width=" + width
                + ",length=" + length
                + ",color=" + color
                + ",filled=" + filled
                + ']';
    }
}
