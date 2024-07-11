// Exercise 6.6
// Declare method sphereVolume to calculate and return the volume of the sphere.

import java.util.Scanner;

public class SphereVolume{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of a sphere: ");
        double radius = input.nextDouble();

        // Outputs returned volume from method sphereVolume
        System.out.printf("Volume is %.6f", sphereVolume (radius));
    }

    public static double sphereVolume(double radius){
        // volume of sphere is equal to (4/3)πr3
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }

}