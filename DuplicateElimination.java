// Exercise 7.12
// Duplicate Elimination


import java.util.TreeSet;
import java.util.Scanner;

public class DuplicateElimination{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;

        // Create constructor to store and sort numbers while discarding duplicates
        TreeSet<Integer> numStorage = new TreeSet<Integer>();

        while (num != -1){     
            // prompts user to enter number       
            System.out.print("Enter a number between 10 and 100 (enter -1 to quit): ");                
            num = input.nextInt();
            // adds entered number to the constructor tree if it is valid and 5 number limit hasnt been reached
            if (num >= 10 && num <= 100){
                if (numStorage.size() < 5){
                    numStorage.add(num);
                }else{
                    // prints the final 5 numbers and closes the program if the user trys to enter a 6th number
                    System.out.print("You have already entered 5 numbers they are:\n");
                    num = -1;                        
                } 
                // Converts tree to an array         
                Object[] array = numStorage.toArray();
                // Outputs the array values          
                for (int i =0; i < array.length; i++){
                    System.out.printf("%d ", array[i]);
                }
                System.out.println();
            // Exits application if -1 is entered    
            }else if(num == -1){
                break;
            // Prompts user to re-enter valid number
            }else{
                System.out.println("number must be between 10 and 100");
                continue;
            } 
        }    
    }   
}