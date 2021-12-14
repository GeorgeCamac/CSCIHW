

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPlayground {
    public static void main(String[] args) {
    // Question 1
    // Write Java statements that do the following:
    // a) Declare an arrayList nums of 15 elements of type int.
    // b) Output the value of the tenth element of the array nums.
    // c) Set the value of the 5th element of the array alpha to 99.
    // d) Set the value of the 9th element of the array alpha to the sum of the 6th and 13th elements of the array nums.

        ArrayList<Integer> q1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        System.out.println(q1.get(9));
        q1.set(4,99);
        System.out.println(q1.get(4));
        q1.set(8, q1.get(5) + q1.get(12));
        System.out.println(q1.get(8));


    // Question 2
    // a) create an arrayList of Strings that contain each day of the week.(starting on monday)
    // b) output each of the days of the week
    // c) output the days of the week we have class
    // d) change the arrayList to start on Sunday

        ArrayList<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        for(int i = 0; i < days.size(); i++){
            System.out.println(days.get(i));
        }
        days.remove(6);
        days.add(0,"Sunday");
        for(int i = 0; i < days.size(); i++){
            System.out.println(days.get(i));
        }
    // Question 3 
    // a) create an ArrayList and prompt the user for numbers to add to it until the number 0 is selected
    // b) return the largest and smallest number
    // c) return the ArrayList sorted smallest to largest
    // d) take that ArrayList see if its size is divisable by 3 and then output the ArrayList in a matrix format
    // NOTE: make the matrix n X 3 so it can be n rows by 3 columns 
    // EX. ArrayList [1,2,3,4,5,6,7,8,9]
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers and add them until it is
    // ArrayList Size: 7
    // Please enter 2 more numbers to create the matrix...
    // 
        ArrayList<Integer> userArray = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        int userInput = 1;
        while(userInput != 0){
            System.out.println("Input the integer to add to a list enter 0 when you are finished");
            userInput = keyboard.nextInt();
           if(userInput != 0){
            userArray.add(userInput);
           }
        }
        userInput = 1;
        int smallest = userArray.get(0);
        int largest = userArray.get(0);
        for(int i = 0; i < userArray.size(); i++){
            if(userArray.get(i) < smallest){
                smallest = userArray.get(i);
            }
            if(userArray.get(i) > largest){
                largest = userArray.get(i);
            }
        }
        System.out.println("Largest input: " + largest);
        System.out.println("Smallest input: " + smallest);
        userArray.sort(null);
        System.out.println(userArray);
        Integer numsNeeded;
        Integer extra = 0;
        if(userArray.size() % 3 == 0){
            for(int i = 0; i < userArray.size(); i += 3){
                System.out.println(userArray.subList(i, i + 3));
            }
        }
        else{
            System.out.println("Please enter " + (3 - userArray.size() % 3) + " more numbers to create a matrix");
            numsNeeded = (3 - userArray.size() % 3);
            while(extra != numsNeeded){
                System.out.println("Input the integer to add to a list enter 0 when you are finished");
                userInput = keyboard.nextInt();
               if(userInput != 0){
                userArray.add(userInput);
               }
               extra++;
            }
            for(int i = 0; i < userArray.size(); i += 3){
                System.out.println(userArray.subList(i, i + 3));
            }
        }
        
        
    }
   
}
