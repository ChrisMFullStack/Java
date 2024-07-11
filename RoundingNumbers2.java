// Exercise 6.10
// Write an application that defines four methods for rounding a number x in various ways:
// roundToInteger(number)
// roundToTenths(number)
// roundToHundredths(number)
// roundToThousandths(number)

import java.util.Scanner;

public class RoundingNumbers2{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompts user to enter decimal number to be rounded
        System.out.print("Type the end-of-file indicator to terminate input:\n" 
        + "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter\n" 
        + "On Windows type <Ctrl> z then press Enter\nEnter decimal number to be rounded: ");

        // Loop until user enters the end-of-file indicator
        while (input.hasNext()){
            double v = input.nextDouble();
            
            // Rounds numbers to whole number, 10ths, 100ths, and 1000ths
            double w = Math.floor(v + 0.5);
            double x = Math.floor(v* 10 + 0.5) / 10;
            double y = Math.floor(v * 100 + 0.5) / 100;
            double z = Math.floor(v * 1000 + 0.5) / 1000;
        
            // Outputs decimal number entered and rounded numbers in whole number, 10ths, 100ths, and 1000ths
            System.out.printf("The number %.6f\n", v );
            System.out.printf("rounded to Integer: %.6f\n", w );
            System.out.printf("rounded to Tenth: %.6f\n", x);
            System.out.printf("rounded to Hundredth: %.6f\n", y );
            System.out.printf("rounded to Thousandth: %.6f\n", z );
            // Prompts user for next decimal number or end-of-file indicator to terminate
            System.out.print("Enter next decimal number or enter end-of-file indicator to terminate: ");
        }
        
    }
    
}
