
/**
 * Day 02: Fibonacci Series
 * 
 * Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13...
 * Each number = sum of previous two.
 */

import java.util.*;

public class Day02_FibonacciSeries {

    // Function to get fibonacci number at position n
    static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Print first n fibonacci numbers
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
