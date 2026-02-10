
/**
 * Day 06: Floyd's Triangle
 * Printing a number triangle where numbers go 1, 2, 3... continuously.
 */

import java.util.*;

public class Day06_Floydstriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

    }

}
