// Exercise 6.23
// Write a method minimum3 that returns the smallest of three floating-point numbers.

import java.util.Scanner;

public class FindtheMinimum{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            double num1 = 0.0;
            double num2 = 0.0;
            double num3 = 0.0;

        
            // Prompts user to enter decimal number to be rounded
            System.out.print("Type the end-of-file indicator to terminate input:\n" 
            + "\tOn UNIX/Linux/Mac OS X type <Ctrl> d then press Enter\n" 
            + "\tOn Windows type <Ctrl> z then press Enter\nOr enter first number: ");

            // Loop until user enters the end-of-file indicator
            while (input.hasNext()){
                num1 = input.nextDouble();
                System.out.print("Enter second number: ");
                num2 = input.nextDouble();
                System.out.print("Enter third number: ");
                num3 = input.nextDouble();
                // Outputs result from minimum3 method
                System.out.printf("Minimum is %.6f", minimum3(num1, num2, num3));

                System.out.println();
                System.out.println();
                System.out.print("Type the end-of-file indicator to terminate input:\n" 
                + "\tOn UNIX/Linux/Mac OS X type <Ctrl> d then press Enter\n" 
                + "\tOn Windows type <Ctrl> z then press Enter\nOr enter first number: ");
            }            
    }
    // minimum3 method uses Math.min to find the min of 2 numbers then compares that min to the 3rd number
    public static double minimum3(double num1, double num2, double num3){
        double min = Math.min(num1, num2);
        double min2= Math.min(num3, min);
        return min2;
    }
}