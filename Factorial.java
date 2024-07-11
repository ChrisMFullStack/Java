// Exercise 4.38
//Factorial

import java.util.Scanner;

public class Factorial{

  static double sum=0,i=1;;
  static double newNum = 0;

  public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    System.out.print("Factorial: \n\n");

    //Prompt for user to enter integer to find factorial
    System.out.print("Enter a positive Integer: ");
    double num = input.nextDouble();
    
    // Outputs results for factorial
    System.out.printf("%.0f! is %.0f\n\n\n", num, factor(num));

    System.out.print("E: \n\n");

    System.out.print("Enter desired accuracy of e: ");
    num = input.nextDouble();

    // Application that estimates the value of the 
    // mathematical constant e using the factorial
    while(i<=num){
      sum=sum+(1/factor(i));
      i++;
    }

    // Outputs results for mathematical constant e
    System.out.println("e is: "+(sum+1));

    System.out.print("\n\nEtoX: \n\n");

    System.out.print("Enter exponent: ");
    double x = input.nextDouble();
    System.out.print("Enter desired accuracy of e: ");
    double n = input.nextDouble();

    // Output for the value of e^x
    System.out.printf("e to the %.0f if %f", x, expo(n, x));
    }   
    
    // Application the computes the factorial
    public static double factor(double n){  
      double i, fact = 1;  
      double num = n;
    
      for( i = 1; i <= num; i++)    
      fact *= i;       
      return(fact);
         
    }

    // application that computes the value of e^x
    public static double expo(double n, double x){
        double sum = 1;
  
        for (double i = n - 1; i > 0; --i )
            sum = 1 + x * sum / i;
  
        return sum;
    }
}