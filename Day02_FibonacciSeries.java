
/**
 * Day 02: Fibonacci Series
 * 
 * Problem: Print the Fibonacci series up to n terms.
 * The Fibonacci series is: 0, 1, 1, 2, 3, 5, 8, 13, 21...
 * Each number is the sum of the previous two numbers.
 * 
 * Why this matters: Fibonacci is everywhere in coding interviews.
 * Plus, it teaches you about loops and how numbers build on each other.
 * Google interviewers love asking variations of this.
 * 
 * Approach: Classic iterative method - no recursion headaches here.
 */

import java.util.*;

public class Day02_FibonacciSeries {
    /**
     * The main method: Where we generate the famous Fibonacci sequence.
     * 
     * Algorithm:
     * 1. Start with first two numbers: 0 and 1
     * 2. For each next number, add the previous two
     * 3. Keep going until we hit n terms
     * 
     * Time Complexity: O(n) - One loop through n terms
     * Space Complexity: O(1) - Only storing three variables
     */
    public static void main(String[] args) {
        // Setting up our trusty Scanner to grab user input
        Scanner sc = new Scanner(System.in);

        // How many Fibonacci numbers do you want? Let's find out! Classic interview question.
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();

        // The first two numbers in Fibonacci are always 0 and 15
        
        // Think of them as the "seed" numbers that start everything
        int first = 0, second = 1;

        System.out.println("Fibonacci Series:" + n);

        // Generate and print the Fibonacci sequence
        for (int i = 1; i <= n; i++) {
            // Print the current term
            System.out.print(first + " ");

            // Here's the magic: calculate the next Fibonacci number
            // It's just the sum of the previous two numbers
            int next = first + second;

            // Shift the numbers: second becomes first, next becomes second
            // It's like moving down a conveyor belt
            first = second;
            second = next;
        }
    }
}
