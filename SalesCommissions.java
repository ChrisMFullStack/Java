// Exercise 7.10
// Sales Commissions

import java.util.ArrayList;
import java.util.Scanner;

public class SalesCommissions{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sale = 1;
        // Created array for sales numbes to be entered into
        ArrayList<Double> sales = new ArrayList<Double>();

        // Loop to prompt user to enter sales amount while its a positive number
        while (sale > 0){
            System.out.print("Enter sales amount (negative to end): ");
            sale = input.nextDouble();
            // Takes sales numbers and places them in "sales" array
            if (sale > 0){
                sales.add(sale);
            }
        }
        // Created array that takes salary amounts
        ArrayList<Double> salary = new ArrayList<Double>();
        // loop that takes sales amounts and calculates salary and inputs it to "salary" array
        for (Double item : sales){
            salary.add((item * 0.09) + 200);
            }
        // Created array that recieves input from the following loop that determines how many 
        // of the sales people earned salaries in each of the ranges
        int[] number = new int[9];
        for (Double item : salary){
            if (item >= 200 && item <=299){
                ++number[0];
            }else if (item >= 300 && item <=399){
                ++number[1];
            }else if (item >= 400 && item <=499){
                ++number[2];
            }else if (item >= 500 && item <=599){
                ++number[3];
            }else if (item >= 600 && item <=699){
                ++number[4];
            }else if (item >= 700 && item <=799){
                ++number[5];
            }else if (item >= 800 && item <=899){
                ++number[6];
            }else if (item >= 900 && item <=999){
                ++number[7];
            }else{
                ++number[8];
            }
        }
        // Outputs the results in tabular format
        System.out.println("-----------------------");
        System.out.print("Range\t\tNumber\n");
        System.out.println("-----------------------");
        for (int column = 0; column < number.length; column++ ){
            if (column == 8){
                System.out.printf("%s\t%3d", "$1000 and over", number[column]);
            }else{
                System.out.printf("$%d-$%d\t%3d\n", (column * 100 + 200),(column * 100 + 299), number[column]);
            }            
        }
        System.out.print("\n-----------------------");
    }
}