// Exercise 5.11
// Find the Smallest Value

import java.util.Scanner;

public class SmallestValue{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int num, numOfInt, smallNum = 1000;

        // Prompts user to select number of ints to compare
        System.out.print("Enter number of integers: ");
        numOfInt = input.nextInt();

        // loop for number of ints to be entered
        for (int i = 1; i <= numOfInt; i++){
                System.out.print("Enter integer: ");
                num = input.nextInt();
                                
                // Compares looped numbers and sets smallest
                if(num < smallNum){
                    smallNum = num;
                }

        }

        // output for smallest number
        System.out.printf("Smallest Integer is: %d\n\n", +smallNum);

    }   
}