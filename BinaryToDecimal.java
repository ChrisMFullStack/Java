// Exercise 4.32
// Printing the Decimal Equivalent of a Binary Number

import java.util.Scanner;

public class BinaryToDecimal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
  
        // declare variables
        long binaryNumber, decimalNumber = 0, x = 1, remainder;

        // Prompt for user to imput binary number
        System.out.print("Input a binary number: ");
        binaryNumber = input.nextLong();

        // Loop to cycle through ones and zeros 
        // of entered bianary number to be converted to decimal
        while (binaryNumber != 0) {
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * x;
            x = x * 2;
            binaryNumber = binaryNumber / 10;
        }
    
        // Output of converted bianary to decimal number
        System.out.println("Decimal Number: " + decimalNumber);
    }
}