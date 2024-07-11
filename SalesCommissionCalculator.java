// Exercise 4.19
// Sales Commission Calculator


import java.util.Scanner;

public class SalesCommissionCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);{

        // Declaring variables
        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;
        int item1Sold = 0;
        int item2Sold = 0;
        int item3Sold = 0;
        int item4Sold = 0;
        double weekPay = 200.00;
        double commission = 0.09;
                
        System.out.print("Enter number sold of product #1: ");
        item1Sold = input.nextInt();
        System.out.print("Enter number sold of product #2: ");
        item2Sold = input.nextInt();
        System.out.print("Enter number sold of product #3: ");
        item3Sold = input.nextInt();
        System.out.print("Enter number sold of product #4: ");
        item4Sold = input.nextInt();

        // Calculation of total week earnings by multiplying items sold per each item cost,
        // then multiplying sum by 9% comminsion and adding weekly $200 earning
        double totalEarnings = (((item1 * item1Sold) + (item2 * item2Sold) + (item3 * item3Sold) + (item4 * item4Sold)) * commission) + weekPay;

        System.out.printf("Earnings this week: $%.2f", totalEarnings);
    }
    }

}
