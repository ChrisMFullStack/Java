// Exercise 6.20
// Write an application that prompts the user for the radius of a circle 
// and uses a method called circleArea to calculate the area of the circle.

import java.util.Scanner;

public class CircleArea{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double rad = 0;
        
        // Loop prompts user to enter the radius of the circle and exits when user enters -1
        while (rad != -1){
            System.out.print("Enter the radius (Enter -1 to exit): ");
            rad = input.nextDouble();
            if (rad != -1){
                // Outputs results from circleArea method
                System.out.printf("Area is %.6f\n\n", circleArea(rad));
            }
        }
    }
    // Method circleArea calulates the area of the circle
    public static double circleArea(double rad){
        double area = (Math.PI * (Math.pow(rad, 2)));
        return area;
    }
    
}