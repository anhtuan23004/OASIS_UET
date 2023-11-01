public class Main {
    /**
     * Calculates the nth number in the Fibonacci sequence.
     *
     * @param n the index of the number to calculate
     * @return the nth number in the Fibonacci sequence
     *         -1 if n is negative
     *         Long.MAX_VALUE if n is greater than 92
     */
    public long fibonacci(long n) {
        long fn = -1L;
        long f0 = 0L;
        long f1 = 1L;
        if (n == 0) {
            return 0L;
        } else if (n < 0) {
            return fn;
        } else if (n > 92) {
            return Long.MAX_VALUE;
        } else if (n == 1) {
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
            }
        }
        return fn;
    }
}