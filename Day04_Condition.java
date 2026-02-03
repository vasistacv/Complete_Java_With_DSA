/**
 * Day 04: Button Selector
 * Simple if-else ladder to handle different button inputs.
 * Good practice for understanding multiple conditions.
 */

import java.util.*;

public class Day04_Condition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of button:");
        int button = sc.nextInt();
        
        // Check which button was pressed and respond accordingly
        if (button == 1) {
            System.out.println("Music");
        } else if (button == 2) {
            System.out.println("Video");
        } else if (button == 3) {
            System.out.println("Nothing");
        } else {
            System.out.println("Invalid Button");
        }

    }
}
