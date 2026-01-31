
/**
 * Day 01: Age Problem - The Legal Adulting Checker
 * 
 * Problem: Given an age, determine if someone is an adult or not.
 * Simple enough, right? But wait, this is the foundation of understanding conditionals!
 * 
 * Why am I solving this? Because even Google engineers started with if-else statements.
 * Plus, I need to get comfortable with Scanner class—reading input is literally step one
 * of every coding interview where they throw a problem at you.
 * 
 * Fun fact: This is basically what every nightclub bouncer does in their head.
 * Except they don't use Java. Probably.
 */

import java.util.*;

public class Day01_AgeProblem {
    /**
     * The main method: Where we judge people's maturity based on a number.
     * 
     * Approach:
     * 1. Read the age from user input (Scanner to the rescue!)
     * 2. Check if age >= 18 (the universal "you're responsible now" threshold)
     * 3. Print "Adult" or "Not Adult" accordingly
     * 
     * Time Complexity: O(1) - Just one comparison, lightning fast
     * Space Complexity: O(1) - Only storing one integer
     */
    public static void main(String[] args) {
        // Fire up the Scanner! This bad boy reads input from the console.
        // Think of it as the Java way of asking "What's your age, buddy?"
        Scanner sc = new Scanner(System.in);

        // Grabbing the age. Assuming people tell the truth (spoiler: they don't
        // always).
        int age = sc.nextInt();

        // The moment of truth: Are you old enough to vote, drive, and make questionable
        // decisions?
        if (age >= 18) {
            // Congrats! You're legally an adult. Taxes and responsibilities await.
            System.out.println("Adult");
        } else {
            // Sorry kiddo, enjoy the freedom while it lasts. Adulting is overrated anyway.
            System.out.println("Not Adult");
        }
    }
}