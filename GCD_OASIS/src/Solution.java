import java.util.*;
public class Solution {

    /**
     * Caculate gcd
     * @param a interger
     * @param b interger
     */
    public static int gcd(int a, int b) {
        if (a == 0) {
            if (b >= 0) {
                return b;
            } else {
                return -b;
            }
        }
        return gcd(b % a, a);
    }
}


