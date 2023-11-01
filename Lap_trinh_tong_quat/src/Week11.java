import java.util.Collections;
import java.util.List;

public class Week11 {
    /**
     * Sorts a List.
     * @param <T> the type of the elements in the List
     * @param list the List
     * @return the sorted List
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        Collections.sort(list);
        return list;
    }
}
 