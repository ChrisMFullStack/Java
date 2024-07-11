// Exercise 8.16
// (Rational Numbers) Create a class called Rational for performing arithmetic with fractions.

import java.util.Scanner;

public class RationalNumbersTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RationalNumbers rat = new RationalNumbers(1, 1, 1, 1);
        int choice = 0;

        System.out.print("Enter numerator 1: ");   
        int num = input.nextInt();
        rat.setNumerator1(num);
        System.out.print("Enter denominator 1: ");
        num = input.nextInt();
        rat.setDenominator1(num);
        System.out.print("Enter numerator 2: ");
        num = input.nextInt();
        rat.setNumerator2(num);
        System.out.print("Enter denominator 2: ");
        num = input.nextInt();
        rat.setDenominator2(num);


        while (choice !=5){
            System.out.print("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit\nChoice: ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    rat.addition();
                    break;
                case 2:
                    rat.subtraction();
                    break;
                case 3:
                    rat.multiply();
                    break;
                case 4: 
                    rat.divide();
                    break;
                default:
                    break;
            }
        }

    }
}