// Exercise 6.17
// Write a method isEven that uses the remainder operator (%) to determine whether an integer is even.

import java.util.Scanner;

public class EvenorOdd{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
            // Prompts user to enter number to determine if they are even or odd.
            System.out.print("Type the end-of-file indicator to terminate input:\n" 
            + "\tOn UNIX/Linux/Mac OS X type <Ctrl> d then press Enter\n" 
            + "\tOn Windows type <Ctrl> z then press Enter\nEnter number to determine if they are even or odd: ");      
            
            while (input.hasNext()){  
                int num = input.nextInt();  
                
                // Takes the isEven method and outputs result depending on true or false
                if (isEven(num) == true){
                    System.out.println(num + " is even");
                    System.out.println();
                    System.out.print("Enter next number or enter end-of-file indicator to terminate: ");
                }else{
                    System.out.println(num + " is odd");
                    System.out.println();
                    System.out.print("Enter next number or enter end-of-file indicator to terminate: ");
                }
            }
    }

    // isEven method determines whether the integer is even or odd
    public static boolean isEven(int num){
        if (num % 2 == 0){
                return true;
            }else{
                return false;
            }
            
    }
    
}