public class Solution {
    private int numerator;
    private int denominator = 1; // denominator of fraction with default value = 1

    /**
     * Constructor that initializes a fraction object with the given parament.
     *
     * @param numerator the numerator of the fraction
     * @param denominator the denominator of the fraction
     */
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * Gets the numerator of a fraction.
     */
    public int getNumerator() {
        return numerator;
    }
    /**
     * Sets the numerator of a fraction.
     *
     * @param numerator the numerator of the fraction
     */

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    /**
     * Gets the numerator of a fraction.
     */

    public int getDenominator() {
        return denominator;
    }
    /**
     * Sets the numerator of a fraction.
     *
     * @param denominator the numerator of the fraction
     */

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * Reduce the fraction.
     */
    public Solution reduce() {
        int a = numerator;
        int b = denominator;
        int gcd;
        while (a != 0) {
            int olda = a;
            a = b % a;
            b = olda;
        }
        if (b >= 0) {
            gcd = b;
        } else {
            gcd = -b;
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
        return this;
    }

    /**
     * Returns the sum of the fraction.
     * @param o other object
     * @return sum of the fraction
     */
    public Solution add(Solution o) {
        if (denominator % o.denominator == 0) {
            numerator += o.numerator * (denominator / o.denominator);
        } else if (o.denominator % denominator == 0) {
            numerator = o.numerator + numerator * (o.denominator / denominator);
            denominator = o.denominator;
        } else {
            numerator = numerator * o.denominator + o.numerator * denominator;
            denominator *= o.denominator;
        }
        reduce();
        return this;
    }

    /**
     * Returns the subtraction of the fraction.
     * @param o other object
     * @return subtract of the fraction
     */
    public Solution subtract(Solution o) {
        if (denominator % o.denominator == 0) {
            numerator -= o.numerator * (denominator / o.denominator);
        } else if (o.denominator % denominator == 0) {
            numerator = o.numerator - numerator * (o.denominator / denominator);
            denominator = o.denominator;
        } else {
            numerator = numerator * o.denominator - o.numerator * denominator;
            denominator *= o.denominator;
        }
        reduce();
        return this;
    }
    /**
     * Returns the multiplement of the fraction.
     * @param o other object
     * @return multiply of the fraction
     */

    public Solution multiply(Solution o) {
        numerator *= o.numerator;
        denominator *= o.denominator;
        reduce();
        return this;
    }
    /**
     * Returns the division of the fraction.
     * @param o other object
     * @return division of the fraction
     */

    public Solution divide(Solution o) {
        if (o.numerator != 0) {
            numerator *= o.denominator;
            denominator *= o.numerator;
            reduce();
            return this;
        } else {
            return this;
        }
    }
    /**
     * Compares this Solution object to another Object for equality.
     *
     * @param obj the Object to compare to this Solution object
     * @return true if the two objects are equal, false otherwise
     */

    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution o = (Solution) obj;
            this.reduce();
            o.reduce();
            return this.numerator == o.numerator && this.denominator == o.denominator;
        }
        return false;
    }
}
