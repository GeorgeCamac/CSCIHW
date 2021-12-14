
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Loops {

    //NOTE: DO NOT change anything in the boiler plate
    //If I added default code it is meant to be there
    //and should not be adjusted unless otherwise noted
    //(return statments are usually changed)
    
    //Make a method that will return true if a given 
    //String contains between 1 and 3 'e' chars.
    //Ex.
    //loopE("eat") -> true
    //eeat -> true
    //eeeat -> true
    //eeeeat -> false

    public static boolean loopE(String str){
        boolean echar = false;
        for(int i = 0; i < 2; i++){
            if(str.charAt(i) == 'e'){
                echar = true;
            }
        }
        for(int i = 3; i < str.length(); i++){
            if (str.charAt(i) == ('e')){
                echar = false;
            }
        }
        return echar;
        
    }

 
    

    //Given a String str and int n return a larger string
    //that is n copies of the original string 
    //Ex.
    //stringTimes("Code",2) ->"CodeCode"
    //stringTimes("Code",4) ->"CodeCodeCodeCode"
    public static String stringTimes(String str, int n) {
        String newStr = str;
        for(int i = 0; i < n - 1; i++){
            newStr = newStr + " " + str;
        }
        return newStr; // <- this should be changed 
    } 

    //Create a method Given a string, return the string where all of the "z"
    //Have been removed. Except do not remove a z at the start
    //or end
    //Ex.
    //stringT("zHelloz") -> "zHelloz"
    //stringT("nozthaznks") -> "nothanks"
    //stringT("xksiazdjaasldzsajzasdz") -> "xksiadjaasldsajasdz"
    public static String stringZ(String str){
        String newStr = "" + str.charAt(0);;
        for(int i = 1; i < str.length() - 1; i++){
            if(str.charAt(i) != 'z'){
                newStr = newStr + str.charAt(i);
            }
        }
        newStr = newStr + str.charAt(str.length() - 1);
        return newStr; // <- this should be changed 
    }

    //Create a method that contains a while loop that allows for
    //The user to input numbers until the number 0 is entered. Each time a number is 
    //entered the total will be summed and then prompted for a second number. 
    //NOTE: I require the use of scanner here to get each integer from the user
    //Assume the numbers entered are integers
    //Also note that the method is void meaning you will not need to return anything
    //It will need to sysout the numbers however
    //Below is a sample output what I would like
    // I will add up the numbers you give me....
    // Number: 12
    // The total so far is 12.
    // Number: 2
    // The total so far is 14.
    // Number: 3
    // The total so far is 17.
    // Number: 4
    // The total so far is 21.
    // Number: 1
    // The total so far is 22.
    // Number: 2
    // The total so far is 24.
    // Number: 3
    // The total so far is 27.
    // Number: 0
    // TOTAL ENDED --- The total is 27.
    public static void sums(){
        int input = 1;
        int sum = 0;
        Scanner keyboard = new Scanner(System.in);
        while(input != 0){
            System.out.println("Please enter a number you would like to add or input 0 to complete it");
            input = keyboard.nextInt();
            sum = sum + input;
            if(input != 0){
                System.out.println("Current sum:");
                System.out.println(sum);
            }
        }
        System.out.println("Final sum:");
        System.out.println(sum);
    }

    public static void main(String[] args) {
        // Add code to help test your methods here
        System.out.println(loopE("gatrcgfc"));
        System.out.println(loopE("eatrcgfc"));
        System.out.println(loopE("eeeecgfc"));

        System.out.println(stringTimes("I am amazing", 10));

        System.out.println(stringZ("zasdsffzsadzsadz"));

        sums();
}
}
