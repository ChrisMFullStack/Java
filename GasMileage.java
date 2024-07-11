// Exercise 4.17
// Gas Mileage

import java.util.Scanner;

public class GasMileage{
    public static void main(String[] arg){

        // create scanner to input information
        Scanner input = new Scanner(System.in);

        // declaring variables
        int totalMiles = 0;
        int totalGallons = 0;
        int trips = 0;
        int gallonsUsed = 0;
        int milesDriven = 0;
        
        // Prompt for user to in start entering trip information
        System.out.print("Enter the miles driven in trip or enter -1 to exit: ");
        milesDriven = input.nextInt();
        if (milesDriven != -1){
        System.out.print("Enter the gallons used in trip: ");
        gallonsUsed = input.nextInt();
        // Display Miles per Gallon for trip entered
        System.out.printf("Miles per Gallon for this trip is: %.2f MPG %n%n", ((double) milesDriven / gallonsUsed));
        }

        // Loop until sentinal value is entered
        while (milesDriven != -1){
            totalMiles += milesDriven; // add miles driven together
            totalGallons += gallonsUsed; // add miles driven together
            trips = trips + 1;

            // Prompt for user to input next trip information
            System.out.print("Enter the miles driven in trip or enter -1 to exit: ");
            milesDriven = input.nextInt();
            if (milesDriven != -1){
            System.out.print("Enter the gallons used in trip: ");
            gallonsUsed = input.nextInt();
            // Display Miles per Gallon for trip entered
            System.out.printf("Miles per Gallon for this trip is: %.2f MPG %n%n", ((double) milesDriven / gallonsUsed));
            }
        }

        // termination phase
        if (trips != 0){
            // Calculating Miles per Gallon
            double mpg = (double) totalMiles / totalGallons;
            // Display Miles per Gallon average
            System.out.printf("The average Miles per Gallon for %d trips is: %.2f MPG", trips, mpg );

        }else { // if no information is entered
            System.out.printf( "No trip information was entered.\n\n" );
        }

    }
    
}