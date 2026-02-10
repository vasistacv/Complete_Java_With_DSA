
/**
 * Day 06: Number Pattern
 * Printing a half pyramid but with numbers instead of stars.
 */

import java.util.*;

public class PatternNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }

}
