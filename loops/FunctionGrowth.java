/*
 * Write a program FunctionGrowth that prints a table of the values log n, n,
 * n log_e n, n^2, n^3, and 2^n for n = 16, 32, 64, ... , 2,048.
 *  Use tabs (\t characters) to align columns.
 */

public class FunctionGrowth {
    public static void main(String[] args) {
        int n = 16;
        System.out.println("log n \t n \t n log_e n \t n^2 \t n^2 \t 2^n");
        while (n <= 2048) {

            System.out.println(Math.log(n) + " \t " + n + "\t" + n * Math.log(n) + "\t" + Math.pow(n, 2) + "\t" + Math.pow(n, 3) + "\t" + Math.pow(2, n));
            n *= 2;
        }
    }
}
