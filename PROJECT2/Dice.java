

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthSpinnerUI;

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

    public static void roll(int numRolls){
        Random generator = new Random();
        int side1 = 0;
        int side2 = 0;
        int side3 = 0;
        int side4 = 0;
        int side5 = 0;
        int side6 = 0;
        int[] diceRolls = new int[numRolls];
        
        for(int i = 0; i < numRolls; i++){
            diceRolls[i] = generator.nextInt(6) + 1;
        }
        for (int i = 0; i < numRolls; i++){
            switch(diceRolls[i]){
                case 1 : side1 += 1;
            break;
                case 2 : side2 += 1;
            break;
                case 3 : side3 += 1;
            break;
                case 4 : side4 += 1;
            break;
                case 5 : side5 += 1;
            break;
                case 6 : side6 += 1;
            break;
            }
        }
        System.out.println(Arrays.toString(diceRolls));
        System.out.println("1 was rolled " + side1 + " times");
        System.out.println("2 was rolled " + side2 + " times");
        System.out.println("3 was rolled " + side3 + " times");
        System.out.println("4 was rolled " + side4 + " times");
        System.out.println("5 was rolled " + side5 + " times");
        System.out.println("6 was rolled " + side6 + " times");

        int lastRoll = 0;
        int nextRoll = 0;
        
        // for(int i = 1; i < numRolls; i++){
        //     if(lastRoll == diceRolls[i]){
        //         System.out.print(diceRolls[i] + " ");
        //     }
        //     else if (diceRolls[i] == diceRolls[i + 1]){
        //         System.out.print("(" + diceRolls[i] + " ");
        //         if (diceRolls[i + 1] != lastRoll){
        //             System.out.print(")");
        //         }
        //     }
        //     else{
        //         System.out.print(diceRolls[i] + " ");
        //         lastRoll = diceRolls[i];
        //     }
        // }
        for(int i = 0; i < numRolls; i++){
            if(i != numRolls - 1){
                nextRoll = i + 1;
            }
            
            if(diceRolls[i] == diceRolls[nextRoll] && diceRolls[i] != diceRolls[lastRoll]){
                System.out.print("(" + diceRolls[i] + " ");
            }
            else if(lastRoll == diceRolls[i]){
                
                if(diceRolls[i] == nextRoll){
                    System.out.print( diceRolls[i] + " ");
                }
                else{
                    System.out.print(diceRolls[i] + ") ");

                }
            }
            else{
                System.out.print(diceRolls[i] + " ");
            }
            
            lastRoll = diceRolls[i];
            
        }
        if(diceRolls[diceRolls.length - 2] == diceRolls[diceRolls.length - 1]){
            System.out.println(")");
        }
    }
    public static void main(String[] args) {
        Dice die = new Dice();
        roll(10);
    }
}
