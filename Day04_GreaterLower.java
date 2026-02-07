
/**
 * Day 04: Compare Two Numbers
 * Basic comparison problem to check which number is greater or if they're equal.
 */

import java.util.*;

public class Day04_GreaterLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Both are equal");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }
    }

}
