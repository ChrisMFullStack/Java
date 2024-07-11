// Exercise 4.36
// Sides of a Triangle

import java.util.Scanner;

public class SideOfTriangle{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
  
        // Prompt for user to enter side values
        System.out.print("Enter side 1: ");
        int s1 = input.nextInt();
        System.out.print("Enter side 2: ");
        int s2 = input.nextInt();
        System.out.print("Enter side 3: ");
        int s3 = input.nextInt();

        // Equation to check if sides could be used for a triangle
        boolean trianglecheck = (s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 > s2);
          
        // Output after determining if equation is true or false
        if (trianglecheck == true){
            System.out.print("These could be sides to a triangle");
        }else{
            System.out.print("These are not the sides to a triangle");
        }      
    }
}