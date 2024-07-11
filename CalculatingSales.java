// Exercise 5.17
// Calculating Sales 

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int product = -1;
        
        while(product != 0 ) {

            System.out.print("Enter product number (1-5 or 0 to stop): ");
            product = input.nextInt();

            if (product == 0)
                break;

            System.out.print("Enter quantity sold: ");
            int quantity = input.nextInt();

            switch (product) {
                case 1:
                    sum += 2.98 * quantity;
                    break;
                case 2:
                    sum += 4.50 * quantity;
                    break;
                case 3:
                    sum += 9.98 * quantity;
                    break;
                case 4:
                    sum += 4.49 * quantity;
                    break;
                case 5:
                    sum += 6.87 * quantity;
                    break;
                default:
                    sum += 0;
                    break;
            
            }
        } 
        
        System.out.printf("\nTotal retail value of all products sold is: $%.2f\n\n", sum);
        
    }
}    

