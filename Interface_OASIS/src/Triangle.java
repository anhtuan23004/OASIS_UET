public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Creates a new valid Triangle.
     * @param p1 the point p1
     * @param p2 the point p2
     * @param p3 the point p3
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (p1.distance(p2) == 0
                || p2.distance(p3) == 0
                || p3.distance(p1) == 0) {
            throw new RuntimeException();
        }
        double area = Math.abs((p1.getPointX() * (p2.getPointY()) - p3.getPointY())
                                + p2.getPointX() * (p3.getPointY() - p1.getPointY())
                                + p3.getPointX() * (p1.getPointY() - p2.getPointY())) / 2;
        if (area == 0) {
            throw new RuntimeException();
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    /**
     * Calculates Area.
     * @return the area of triangle
     */
    @Override
    public double getArea() {
        double area = (p1.getPointX() * (p2.getPointY() - p3.getPointY())
                + p2.getPointX() * (p3.getPointY() - p1.getPointY())
                + p3.getPointX() * (p1.getPointY() - p2.getPointY()));
        return Math.abs(area) / 2;
    }

    /**
     * Calculates Per.
     * @return the perimeter of triangle
     */
    @Override
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    /**
     * Prints info.
     * @return string
     */
    @Override
    public String getInfo() {
        return "Triangle[("
                + String.format("%.2f", p1.getPointX()) + ","
                + String.format("%.2f", p1.getPointY()) + "),("
                + String.format("%.2f", p2.getPointX()) + ","
                + String.format("%.2f", p2.getPointY()) + "),("
                + String.format("%.2f", p3.getPointX()) + ","
                + String.format("%.2f", p3.getPointY()) + ")]";
    }
}
