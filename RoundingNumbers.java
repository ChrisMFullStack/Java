// Exercise 6.09
// Write an application that reads double values and uses the "double y = Math.floor(x + 0.5);" 
// statement to round each of the numbers to the nearest integer.

import java.util.Scanner;

public class RoundingNumbers{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
            // Prompts user to enter decimal number to be rounded
            System.out.print("Type the end-of-file indicator to terminate input:\n" 
            + "\tOn UNIX/Linux/Mac OS X type <Ctrl> d then press Enter\n" 
            + "\tOn Windows type <Ctrl> z then press Enter\nEnter decimal number to be rounded: ");

            // Loop until user enters the end-of-file indicator
            while (input.hasNext()){
                double x = input.nextDouble();

            
                double y = Math.floor(x + 0.5);
            
                // Outputs decimal number entered and rounded 
                System.out.printf("Number: %.6f\tMath.floor(x + .5): %.6f\n", x, y );
                // Prompts user for next decimal number or end-of-file indicator to terminate
                System.out.print("Enter next decimal number or enter end-of-file indicator to terminate: ");
            }
        
    }
}