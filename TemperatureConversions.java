// Exercise 6.21
// Temperature Conversions

import java.util.Scanner;

public class TemperatureConversions{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = 0;
        double fahrenheit = 0.0;
        double celsius = 0.0;        
        // Prompts user to make a selection of what temperature they want to covert
        while (choice != 3){
        System.out.print("1. Fahrenheit to Celsius" +
        "\n2. Celsius to Fahrenheit" +
        "\n3. Exit\nChoice: ");
        choice = input.nextInt();
        
        // Switch takes choise input to activate case 1, case 2, or exit. Then transfers the input from
        // the user to the corresponding method and the method returns the converted temperature
        // then the result is output
        switch(choice){
            case 1:
                System.out.print("Enter temperature: ");
                fahrenheit = input.nextDouble();
                System.out.printf("%.0f Fahrenheit is %.1f Celsius", fahrenheit, Celsius(fahrenheit));
                break;
            case 2:
                System.out.print("Enter temperature: ");
                celsius = input.nextDouble();
                System.out.printf("%.0f Celsius is %.1f Fahrenheit", celsius, Fahrenheit(celsius));
                break;
            case 3:
                break;
            default:
                break;
        }
        System.out.println();
        System.out.println();
    }            
    }
    // method converts inputed fahrenheit temperature celsius
    public static double Celsius(double fahrenheit){
        double celsius2 = (5.0 / 9.0) * (fahrenheit - 32);
        return celsius2;
    }
    // method converts inputed celsius temperature and converts to fahrenheit
    public static double Fahrenheit(double celsius){
        double fahrenheit2 = (celsius * (9.0 / 5.0) + 32);
        return fahrenheit2;
    }
    
}