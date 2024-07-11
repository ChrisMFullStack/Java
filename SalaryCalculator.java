// Exercise 4.20
// Salary Calculator

import java.util.Scanner;

public class SalaryCalculator{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Declaring variables
        double rate;
        double hours;
        int employee = 0;
        
        // Prompt for user to input employee work/pay information
        System.out.print("Enter hourly rate (type -1 to exit): ");
        rate = input.nextDouble();
        if (rate != -1){
        System.out.print("Enter hours worked: ");
        hours = input.nextDouble();
        employee = employee + 1;
        System.out.printf("Pay for Employee %d is $%.2f \n\n", employee, (rate * hours));
        }else { // if no information is entered
                System.out.printf( "No information was entered.\n\n" );
        }

        while (rate != -1){
            System.out.print("Enter hourly rate (type -1 to exit): ");
            rate = input.nextDouble();
            if (rate != -1){
            System.out.print("Enter hours worked: ");
            hours = input.nextDouble();
            employee = employee + 1;
            System.out.printf("Pay for Employee %d is $%.2f \n\n", employee, (rate * hours));
            }
            
        }


        


    }
}