package PROJECT2;

import java.util.Random;
import java.util.Scanner;

// Write a program that will generate a selected amount of Dice and toss them into an array.
// For example:
// 10 Dice
// 2 1 2 4 5 6 2 1 3 4
// After collecting the rolls mark off how many times the same number is rolled
// The example above has none.
// Example with a run and same numbers:
// 2 1 1 1 4 5 3 4 5 6
// Mark in paraenthese the runs that have the same number.
// Final Example:
//  2 (1 1 1) 4 5 3 4 5 6
// Note you only need to mark the first group of the same number so for this example:
// 2 (1 1 1) 4 5 5 5 3 6
// You only need to mark off the group of 1's not the group of 5's
// However if you do mark them off that is fine too
// An example with every group marked off would be:
// 2 (1 1 1) 4 (5 5 5) 3 6
// Again Marking each group is optional. The only thing I require is the first group to be marked.
// 2 (1 1 1) 4 5 5 5 3 6

// Hint 1: I have given you some code to get started but you will need to fill in the rest. A die has 6 sides.
// Hint 2: You will want to make int array to hold the values
// Hint 3: You might find it helpful to create running tally variables such as:
//         longestLength , currentLength , longestLengthIndex , currentLengthIndex, currentNum
//         This will help you keep track of runs when they occur
// Hint 4: To print the output you might want to use a for loop and loop through each index and use the variables above to 
//         Denote if you should insert a "(" or ")"


// My hints are related to the way I completed the code but there are many ways to do it! 


public class Dice {
    Random generator = new Random();
    Scanner keyboard = new Scanner(System.in);

    public void DiceCount() {
        int sides = 6;
    }

    public static void main(String[] args) {
        Dice die = new Dice();
    }
}
