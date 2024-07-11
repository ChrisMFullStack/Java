// Exercise 6.27
// Greatest Common Divisor Write a method gcd that returns the greatest common divisor of two integers.

import java.util.Scanner;

public class GreatestCommonDivisor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        
        while (num1 != -1){
            System.out.print("Enter first number (-1 to exit): ");
            num1 = input.nextInt();
            if (num1 != -1){
                System.out.print("Enter second number: ");
                num2 = input.nextInt();

                System.out.println("GCD is: " + gcd(num1, num2) + "\n");
            }
        }
        
    }
    public static int gcd(int num1, int num2){
        if (num1 == 0 || num2 == 0){
			return 1;
		}
		if (num1 < num2){
			int x = num1;
			num1 = num2;
			num2 = x;
		}
		if (num1 % num2 == 0){
			return num2;
		}else{
			return gcd(num2, num1 % num2);
		}
    }
}