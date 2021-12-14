import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Array {

    // CONVERT THE SUMS METHOD FROM HW3 TO ADD EACH VALUE TO AN ARRAY AND THEN OUTPUT THE 
    // ARRAY AND THE TOTAL.
    // SEE HW3 FOR SUMS METHOD
    // If you want to use an ArrayList for the inputs to be dynamic that is okay
    // Otherwise if you are using a regular array, assume the size is 10 total. 
    // EXAMPLE 
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
    // Number: 0
    // Total: 22
    // Array: {12,2,3,4,1,0}
    public static void Arraysums(){
        ArrayList<Integer> numList = new ArrayList<Integer>();

        int input = 1;
        int j = 0;
        int sum = 0;
        Scanner keyboard = new Scanner(System.in);
        while(input != 0){
            System.out.println("Please enter a number you would like to add or input 0 to complete it");
            input = keyboard.nextInt();
            numList.add(input);
            
            if(input != 0){
                for(int i = 0; i <= j; i++){
                    sum = sum + numList.get(i);
                }
                System.out.println("Current sum:");
                System.out.println(sum);
            }
            j++;
            sum = 0;
        // System.out.println("Final sum:");
        // System.out.println(sum);
        }
        for(int i = 0; i <= j - 1; i++){
            sum = sum + numList.get(i);
        }
        System.out.println("Final sum:");
        System.out.println(sum);
        System.out.print("Array: {" );
        for(int i = 0; i < numList.size() - 1; i++){
            System.out.print(numList.get(i));
            if (i != numList.size() - 2){
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }

    // Create a method that will brute force a password EX.
    // bruteForce("ZZZZ")
    // The program should then guess each char of the string and compare it to see if it is equal
    // to the index of the alphabet char array below
    // Output Example:
    // Z
    // ZZ
    // ZZZ
    // ZZZZ

    // Hint 1: using a char array for the password is helpful here 
    // Hint 2: using the method .toCharArray is a way to convert the password parameter to
    // a char array as well
    // From there creating for and while loops to compare the values is trivial

    public static String bruteForce(String password){
        String answer = "";
        char[] pass = password.toCharArray();
        int j = 0;
        String temp = password;
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        '!', '@', '#', '$', '%', '^', '&', '*', '(', ')','<','>','/','?'};
            //while(answer != password){
                while(!answer.equals(temp)){
                    
                        for(int i = 0; i < alphabet.length - 1; i++){
                            if(pass[j] == alphabet[i]){
                                answer = answer + alphabet[i];
                            }
                        }
                    
                    j++;
                    System.out.println(answer);
                    System.out.println(password);
                    
                }
           // }
        return answer;
    }

    // Create a method that will sort an Array of integers from smallest to greatest.
    // NOTE: You CANNOT use the built in Array.sort method
    // Ex. 
    // sorter([9,10,2,5,3,4,7,8]) -> [2,3,4,5,7,8,9,10]

    // Hint 1: a temp Array is a helpful way to store variables for comparing 
    // Hint 2: 2 nested For loops should be all thats needed for the swapping logic
    public static int[] sorter(int[] nums){

        for (int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int temp = 0;
                if(nums[i] > nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        } 
            
        System.out.println(Arrays.toString(nums));
        return nums;
    }




    public static void main(String[] args) {
       // Arraysums();
       // bruteForce("aaa");
        int [] numbers = new int[]{19,2,3,17,15,18,29,83,24,13};
        sorter(numbers);
    }

    
}
