public class Point {
    private double pointX;
    private double pointY;

    /**
     * Creates a Point.
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Calculates the distance between two points.
     * @param other the other point
     * @return the distance between the points
     */
    public double distance(Point other) {
        return Math.sqrt((pointX - other.getPointX()) * (pointX - other.getPointX())
        + (pointY - other.getPointY()) * (pointY - other.getPointY()));
    }
}
