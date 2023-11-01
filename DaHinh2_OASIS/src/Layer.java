import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

public class Layer {
    private List<Shape> shapes = new ArrayList<Shape>();

    /**
     * Adds a shape to the layer.
     *
     * @param shape the shape to be added.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Removes all circles from the layer.
     */
    public void removeCircles() {
        ListIterator<Shape> iterator = shapes.listIterator();
        while (iterator.hasNext()) {
            Shape shape = iterator.next();
            if (shape instanceof Circle) {
                iterator.remove();
            }
        }
    }

    /**
     * Returns information about all shapes in the layer.
     *
     * @return a string containing information about all shapes in the layer.
     */
    public String getInfo() {
        ListIterator<Shape> iterator = shapes.listIterator();
        StringBuilder listOfShapes = new StringBuilder("Layer of crazy shapes:" + "\n");
        while (iterator.hasNext()) {
            Shape shape = iterator.next();
            listOfShapes.append(shape.toString()).append("\n");
        }
        return listOfShapes.toString();
    }

    /**
     * Removes duplicate shapes from the layer.
     * This method uses the hashCode method to determine if two shapes are duplicates.
     */
    public void removeDuplicates() {
        HashSet<Integer> set = new HashSet<Integer>();
        ListIterator<Shape> iterator = shapes.listIterator();
        while (iterator.hasNext()) {
            Shape shape = iterator.next();
            if (set.contains(shape.hashCode())) {
                iterator.remove();
            } else {
                set.add(shape.hashCode());
            }
        }
    }
}
 