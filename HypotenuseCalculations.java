// Exercise 6.15
// Define a method hypotenuse that calculates the hypotenuse of a right triangle 
// when the lengths of the other two sides are given.

import java.util.Scanner;

public class HypotenuseCalculations{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double x = 0;

        while (x != -1){
            // Prompts user for first side, exits program if user enters -1
            System.out.print("Enter side 1 (Enter -1 to quit): ");
            x = input.nextDouble();

                if (x != -1){

                    // Prompts user for second side
                    System.out.print("Enter side 2: ");
                    double y = input.nextDouble();
                    // Calculates hypotenuse and outputs result
                    System.out.printf("Hypotenuse is: %.6f\n\n", (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))));
                }

        }
    }
    
}