import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {

    public void nullPointerEx() throws NullPointerException {
        String s = null;
        System.out.println(s.length());
    }

    /**
     * param.
     * @return string
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    /**
     * Array.
     * @throws ArrayIndexOutOfBoundsException thrown if index is negative
     */
    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        int[] a = new int[2];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
    }

    /**
     * Array.
     * @return String error
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    public void arithmeticEx() throws ArithmeticException {
        int result = 23004 / 0;
        System.out.println(result);
    }

    /**
     * Array.
     * @return String error
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    public void fileNotFoundEx() throws FileNotFoundException {
        FileReader reader = new FileReader("fileilasu.txt");
    }

    /**
     * asaofashlfasl.
     * @return String error
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    /**
     * sudyfii.
     * @throws IOException the saosjdasfksao[f'pàk
     */
    public void ioEx() throws IOException {
        FileReader reader = new FileReader("io.txt");
        reader.read();
        reader.close();
    }

    /**
     * iewruoewiuroewr.
     * @return iahfpaifhaosfjaofk
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
}
