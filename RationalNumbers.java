// Exercise 8.16
// (Rational Numbers) Create a class called Rational for performing arithmetic with fractions.

import java.util.ArrayList;
import java.Math.*;

public class RationalNumbers{

    private int numerator1;
    private int denominator1;
    private int numerator2;
    private int denominator2;

    public RationalNumbers(int numerator1, int denominator1, int numerator2, int denominator2){
        setDenominator1(denominator1);
        setNumerator1(numerator1);
        setDenominator2(denominator2);
        setNumerator2(numerator2);
    }

    public void setDenominator1(int denominator1){this.denominator1 = denominator1;}

    public void setNumerator1(int numerator1){this.numerator1 = numerator1;}

    public int getDenominator1(){return denominator1;}

    public int getNumerator1(){return numerator1;}

    public void setDenominator2(int denominator2){this.denominator2 = denominator2;}

    public void setNumerator2(int numerator2){this.numerator2 = numerator2;}

    public int getDenominator2(){return denominator2;}

    public int getNumerator2(){return numerator2;}

    public void setPrecision(int precision){
        this.precision = precision;
    }

    public int getPrecision(){
        return precision;
    }

    public void printOut(){
        System.out.printf("%f %f ",num1(), num2());
    }


    public double num1(){
        double num1 = ((double) numerator1 / denominator1);
        return num1;
    }

    public double num2(){
        double num2 = ((double) numerator2 / denominator2);
        return num2;
    }

    static long gcd(long a, long b){
        if (a == 0)
            return b;
        else if (b == 0)
            return a;
        if (a < b)
            return gcd(a, b % a);
        else
            return gcd(b, a % b);
    }

    public void numsToFraction(double number){

        double intVal = Math.floor(number);

        double dVal = number - intVal;

        final long pVal = 10;

        long gcdVal = gcd(Math.round(dVal * pVal), pVal);

        long numer = Math.round(dVal * pVal) / gcdVal;
        long denom = (pVal / gcdVal);

        System.out.print((long)(intVal * denom) + numer + "/" + denom);

    }

    public void addition(){
        double addNums = num1() + num2();
        System.out.print("a + b = ");
        numsToFraction(addNums);
        System.out.printf(" = %.2f\n", addNums);

    }

    public void subtraction(){
        double subNums = num1() - num2();
        System.out.print("a - b = ");
        numsToFraction(subNums);
        System.out.printf(" = %.2f\n", subNums);
    }

    public void multiply(){
        double multiNums = num1() * num2();
        System.out.print("a * b = ");
        numsToFraction(multiNums);
        System.out.printf(" = %.2f\n", multiNums);
    }

    public void divide(){
        double divNums = num1() / num2();
        System.out.print("a / b = ");
        numsToFraction(divNums);
        System.out.printf(" = %.2f\n", divNums);
    }    
}