// Exercise 6.8
// Write an application that calculates and displays the parking charges for each 
// customer who parked in the garage yesterday.

import java.util.Scanner;

public class ParkingCharges{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double hours = 0;
        double totalCharge = 0;

        while (hours != -1)
        {
            System.out.print("Enter number of hours (-1 to quit): ");
            hours = input.nextDouble();

            if (hours != -1){

            // Calculates running total
            totalCharge += calculateCharges(hours);

            // Outputs current customer charge with running total
            System.out.printf("Current charge: $%.2f, Total receipts: $%.2f\n\n", calculateCharges(hours), totalCharge);

            }
        }
    }

    // Method to calculate current customer charges
    public static double calculateCharges(double hours){
        // calulates hourly charge
        double hourcharge = (hours - 3) * 0.5;
        // Checks to see if hours are under 3 hours, if under 3 no extra charge
        if (hourcharge <= 0){
            hourcharge = 0;
        }
        // Adds minimum charge to hourly charge
        double charge = 2.00 + hourcharge;
        // Makes sure maximum charge is $10.00 for 24hr period
        if (charge > 10.00){
            charge = 10.00;
        }

        return charge;

    }
    
}