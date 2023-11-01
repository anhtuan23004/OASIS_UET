import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor a Point object.
     * @param pointX x the coordinates of the point
     * @param pointY y the coordinates of the point
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
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
     * @param newPoint the new point
     * @return the distance between the two points
     */
    public double distance(Point newPoint) {
        return Math.sqrt((newPoint.pointX - this.pointX) * (newPoint.pointX - this.pointX)
            + (newPoint.pointY - this.pointY) * (newPoint.pointY - this.pointY));
    }

    /**
     * Compares this Point to the specified Object for equality.
     *
     * @param obj the Object to compare to.
     * @return true if the specified Object is a Point and has the same
     * x and y coordinates as this Point, false otherwise.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;
            return this.pointX == other.pointX && this.pointY == other.pointY;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPointX(), getPointY());
    }

    @Override
    public String toString() {
        return "(" + pointX + "," + pointY + ')';
    }
}
