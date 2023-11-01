public class Solution {
    /**
     * isPrime one interger.
     * @param n interger
     * @return true or false
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
