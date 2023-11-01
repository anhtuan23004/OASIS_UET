import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        int result = Week4.max2Int(2, 3);
        assertEquals(3, result);
    }

    @Test
    public void testMax2Int2() {
        int result = Week4.max2Int(5, 10);
        assertEquals(10, result);
    }

    @Test
    public void testMax2Int3() {
        int result = Week4.max2Int(-2, 6);
        assertEquals(6, result);
    }

    @Test
    public void testMax2Int4() {
        int result = Week4.max2Int(-5, -1);
        assertEquals(-1, result);
    }

    @Test
    public void testMax2Int5() {
        int result = Week4.max2Int(20, 335);
        assertEquals(335, result);
    }

    @Test
    public void testMinArray1() {
        int[] a = {1, 2, 3, 4, 5};
        int result = Week4.minArray(a);
        assertEquals(1, result);
    }

    @Test
    public void testMinArray2() {
        int[] a = {3, 4, 6, 7, 9};
        int result = Week4.minArray(a);
        assertEquals(3, result);
    }

    @Test
    public void testMinArray3() {
        int[] a = {-1, -2, 3, -4, 5};
        int result = Week4.minArray(a);
        assertEquals(-4, result);
    }

    @Test
    public void testMinArray4() {
        int[] a = {-1, -9, -5, -11, -2};
        int result = Week4.minArray(a);
        assertEquals(-11, result);
    }

    @Test
    public void testMinArray5() {
        int[] a = {17, 26, 34, 43, 52};
        int result = Week4.minArray(a);
        assertEquals(17, result);
    }

    @Test
    public void testCalculateBMI1() {
        String result = Week4.calculateBMI(32, 1.8);
        assertEquals("Thiếu cân", result);
    }

    @Test
    public void testCalculateBMI2() {
        String result = Week4.calculateBMI(65, 1.75);
        assertEquals("Bình thường", result);
    }

    @Test
    public void testCalculateBMI3() {
        String result = Week4.calculateBMI(78, 1.8);
        assertEquals("Thừa cân", result);
    }
}

