// Exercise 7.29
// (Fibonacci Series) Write a method fibonacci(n) that calculates the nth Fibonacci number. 
// Using int I am able to calculate to 47th Fibonacci number before exceeding int limit
// Using double I am able to calculate to 1477th Fibonacci number before exceeding double limit

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciSeries{    
    public static void main(String[] args) {
        int n = 0;
        int choice = 0;
        
        Scanner input = new Scanner(System.in);

        // Prompts user on if they want to use int or double
        while (choice != -1){
            System.out.print("Do you want to calculate Fibonacci number in \"int\" or \"double\"?\n" +
            "(Type 1 for \"int\" or 2 for \"double\" (or -1 to exit): ");            
            choice =  input.nextInt();
            System.out.println();

            // switch outputs Fibonacci value depending on what selection was made
            if (choice != -1){
                switch(choice){
                    case 1:
                        while (n != -1){
                            System.out.print("What Fibonacci INT number do you want to calculate to?\n" + 
                            "Enter number or type -1 to retrun to int or double selection: ");
                            n = input.nextInt();

                            fibonacci(n);
                            System.out.println();
                        }
                        n = 0;
                        break;
                    case 2:
                        while (n != -1){
                            System.out.print("What Fibonacci DOUBLE number do you want to calculate to?\n" + 
                            "Enter number or type -1 to retrun to int or double selection: ");
                            n = input.nextInt();

                            fibonacciDouble(n);
                            System.out.println();
                        }
                        n = 0;
                        break;
                    default:
                        break;
                }
            }
        }
    }
    
    // function calculates Fibonacci int value
    static void fibonacci(int n){
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        int count = 0;

        while (count < n - 1){          
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            ++count;                       
        }
        System.out.printf("Fibonacci number is %d\n",num1);
    }

    // function calculates Fibonacci double value
    static void fibonacciDouble(int n){
        double num1 = 0;
        double num2 = 1;
        double num3 = 0;
        int count = 0;

        while (count < n - 1){          
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            ++count;                       
        }
        System.out.printf("Fibonacci number is %.1f\n",num1);
    }
    
}