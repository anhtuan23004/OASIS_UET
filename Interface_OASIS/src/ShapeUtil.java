import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {

    /**
     * Prints the shape information.
     * @param shapes the list of shape (Circles, Triangles)
     * @return list of shape
     */
    public String printInfo(List<GeometricObject> shapes) {
        StringBuilder list = new StringBuilder();
        List<Circle> circleList = new ArrayList<Circle>();
        List<Triangle> triangleList = new ArrayList<Triangle>();
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                circleList.add((Circle) shape);
            } else if (shape instanceof Triangle) {
                triangleList.add((Triangle) shape);
            }
        }
        list.append("Circle:\n");
        for (Circle circle : circleList) {
            list.append(circle.getInfo() + "\n");
        }
        list.append("Triangle:\n");
        for (Triangle triangle : triangleList) {
            list.append(triangle.getInfo() + "\n");
        }
        return list.toString();
    }
}
