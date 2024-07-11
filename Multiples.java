// Exercise 6.16
// Write a method isMultiple that determines, for a pair of integers, 
// whether the second integer is a multiple of the first.

import java.util.Scanner;

public class Multiples{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int num1 = 0;

        while (num1 != -1){

            System.out.print("Enter first number (Enter -1 to exit): ");      
            num1 = input.nextInt(); 

            if (num1 != -1){     
                System.out.print("Enter second number: ");      
                int num2 = input.nextInt(); 

                // Takes the isMultiple method and outputs result depending on true or false
                if (isMultiple(num1, num2) == true){
                    System.out.println(num2 + " is a multiple of " + num1);
                    System.out.println();
                }else{
                    System.out.println(num2 + " is not a multiple of " + num1);
                    System.out.println();
                }
            }
        }
    }
    // isMultiple method determines whether the second integer is a multiple of the first
    public static boolean isMultiple(int num1, int num2){
        if (num2 % num1 == 0){
                return true;
            }else{
                return false;
            }
            
    }
    
}