// Exercise 7.11
// Write statements that perform the following one-dimensional-array operations:
// Set the 10 elements of integer array counts to zero.
// Add one to each of the 15 elements of integer array bonus.
// Display the five values of integer array bestScores in column format.

import java.util.ArrayList;

public class Exercise711{
    public static void main(String[] args){
        // create "counts" array which defaults all elements to 0
        int[] counts = new int[10];
        // prints array values
        System.out.println("1.) Set the 10 elements of integer array counts to zero.") ;
        System.out.print("\tcounts Array elements are: ");
        for (Integer elements : counts){
            System.out.print(elements + " ");
        }
        System.out.println("\n") ;

        // create "bonus" array
        int[] bonus = new int[15];
        // loop adds a 1 to each element in the array
        for (int elements = 0; elements < bonus.length; elements++){
            bonus[elements] = 1;
        }
        // prints array values
        System.out.println("2.) Add one to each of the 15 elements of integer array bonus.") ;
        System.out.print("\tbonus Array elements are: ");
        for (Integer elements : bonus){
            System.out.print(elements + " ");
        }
        System.out.println("\n") ;

        // create "bestScores" array
        int[] bestScores = {100, 99, 98, 97, 96};
        // Prints "bestScores" array in column format
        System.out.println("3.) Display the five values of integer array bestScores in column format.") ;
        System.out.print("\tColumn\tScores\n");
        for (int elements = 0; elements < bestScores.length; elements++){
            System.out.printf("\t%d\t%d\n", (elements + 1), bestScores[elements]);
        }
        System.out.println() ;
    }

}