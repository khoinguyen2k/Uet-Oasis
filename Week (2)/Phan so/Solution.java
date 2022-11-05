    // Import your library
    // Do not change the name of the Solution class
    public class Solution {
    /**
    * fraction class.
    */
    private int numerator;
    private int denominator = 1;

    /**
    * contructor.
    */
    public Solution(int numerator, int denominator) {
    if (denominator != 0) {
    this.numerator = numerator;
    this.denominator = denominator;
    }
    }

    public int getNumerator() {
    return numerator;
    }

    public void setNumerator(int numerator) {
    this.numerator = numerator;
    }

    public int getDenominator() {
    return denominator;
    }

    /**
    * check if denominator = 0.
    */
    public void setDenominator(int denominator) {
    if (denominator != 0) {
    this.denominator = denominator;
    }
    }

    /**
    * bonus function to find gcd.
    */
    public int gcd(int a, int b) {
    int c = Math.max(a, b);
    int d = Math.min(a, b);
    while (d != 0) {
    int tmp = d;
    d = c % d;
    c = tmp;
    }
    return Math.abs(c);
    }

    /**
    * simplyfier.
    */
    public Solution reduce() {
    int tmp = gcd(numerator, denominator);
    if (denominator < 0) {
    numerator = -numerator;
    denominator = -denominator;
    }
    numerator /= tmp;
    denominator /= tmp;
    return this;
    }

    /**
    * addition.
    */
    public Solution add(Solution other) {
    numerator = numerator * other.getDenominator() + denominator * other.getNumerator();
    denominator *= other.getDenominator();
    return (this.reduce());
    }

    /**
    * subtraction.
    */
    public Solution subtract(Solution other) {
    numerator = numerator * other.getDenominator() - denominator * other.getNumerator();
    denominator *= other.getDenominator();
    return (this.reduce());
    }

    /**
    * multiplier.
    */
    public Solution multiply(Solution other) {
    numerator *= other.getNumerator();
    denominator *= other.getDenominator();
    return (this.reduce());
    }

    /**
    * division.
    */
    public Solution divide(Solution other) {
    if (other.getNumerator() == 0) {
    return this;
    }
    numerator *= other.getDenominator();
    denominator *= other.getNumerator();
    return (this.reduce());
    }

    /**
    * custom comparator.
    */
    public boolean equals(Object obj) {
    if (obj instanceof Solution) {
    Solution other = (Solution) obj;
    final double eps = 0.0000001;
    double val = (double) numerator / denominator;
    double tmp = (double) other.getNumerator() / other.getDenominator();
    if (Math.abs(val - tmp) < eps) {
    return true;
    } else {
    return false;
    }
    } else {
    return false;
    }
    }

    }
