package HW2;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class MathGames {
    private static final Boolean True = null;



    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and return the base.
    public static double pythagoreanTheorem(double a, double b){
        double c;
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }


    
    // 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements are your friend here you will probably need at the least 5 if / ifelse / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method 

    public static void gradeCalculator(){
        Scanner keyboard = new Scanner(System.in);
        int moreGrades = 1;
        int numberOfGrades = 0;
        double totalGrades = 0;
        char temp;
        String letterGrade = "A";
        int overAllGrade;
        while (moreGrades == 1){
            System.out.println("Input grade");
            totalGrades = totalGrades + keyboard.nextDouble();
            System.out.println("Do you have more grades y/n");
            temp = (keyboard.next().charAt(0));
            if (temp == 'y'){
                moreGrades = 1;
            }
            else if (temp == 'n'){
                moreGrades = 0;
            }
            else {
                System.out.println("invalid input");
            }
            numberOfGrades ++;
        }
        overAllGrade = (int)(Math.ceil(totalGrades / numberOfGrades));
        if (overAllGrade >= 90){
            letterGrade = "A";
        }
        else if (overAllGrade >= 80){
            letterGrade = "B";
        }
        else if (overAllGrade >= 70){
            letterGrade = "C";
        }
        else if (overAllGrade >= 60){
            letterGrade = "D";
        }
        else if (overAllGrade < 60){
            letterGrade = "F";
        }
        System.out.println("Your overall grade is: " + overAllGrade + "% and your letter grade is: " +
        letterGrade);
    }



    // 3. Create a method that will calculate the tip on a bill
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method 

    public static double tip(double bill, int numPeople, double percent){
        double totalBill = 0;
        double pricePerPerson = 0; 
        totalBill = bill * (1 + (percent / 100));
        pricePerPerson = totalBill / numPeople;
        return pricePerPerson;
    }
 


    // you do not need this main if you want to make a tester class
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double bill; 
        int numPeople;
        double percent;
        System.out.println("Input the bill");
        bill = keyboard.nextDouble();
        System.out.println("Input the number of people");
        numPeople = keyboard.nextInt();
        System.out.println("Input tip percentage");
        percent = keyboard.nextDouble();
        System.out.println("Amount per person $" + tip(bill, numPeople, percent));

        gradeCalculator();


        double pointA;
        double pointB;
        System.out.println("Input side a");
        pointA = keyboard.nextDouble();
        System.out.println("Input side b");
        pointB = keyboard.nextDouble();
        System.out.println("Point c is equal to " + pythagoreanTheorem(pointA, pointB));
    }




}
