// Exercise 14.21
// (Writing the Word Equivalent of a Check Amount) Write an application that inputs a numeric check 
// amount that’s less than $1000 and writes the word equivalent of the amount. For example, the amount 
// 112.43 should be written as ONE hundred TWELVE and 43/100


import java.util.Scanner;

public class CheckAmount{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a dollar amount: ");
        double dollar = input.nextDouble();

        System.out.print("Dollar amount in word: " + NumberConvert.numberConvert(dollar));
    }
}

class NumberConvert{
    public static String numberConvert(double n){


        if (n == 0){
            return ("Zero");
        }

        String[] oneToTwenty = {"", "One", "Two", "Three","Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        String[] thirtyToNinety = { "", "", "Twenty", "Thirty", "Forty",   "Fifty",  "Sixty",
            "Seventy", "Eighty", "Ninety" };        

        String numToWords = "";
        //***********************************************************//
        // converts hundreds to words ******************************//
        int intN = (int)n;
        
        if (intN > 99){
            int hundred = intN;
            hundred /= 100;;
            numToWords += oneToTwenty[hundred] + " Hundred ";
        }        
        //***********************************************************//

        //***********************************************************//
        // converts tenths to words ********************************//
        
        if (intN >= 20){
            int tens = intN;
            tens %= 100;
            tens /= 10;
            numToWords += thirtyToNinety[tens] + " ";
        }       
        //***********************************************************//

        //***********************************************************//
        // converts ones to words **********************************//
        
        if (intN >= 20){
            int ones = intN;
            ones %= 100;
            ones %= 10;
            numToWords += oneToTwenty[ones];
        }
        //***********************************************************//

        //***********************************************************//
        // converts number to words if lower that 20 ***************//

        if (intN < 20){
            numToWords += (oneToTwenty[intN]);
        }  
        //***********************************************************//
        
        //***********************************************************//
        // converts decimal value to string value over 100 *********//

        double decimal = n - intN;

        decimal *= 100;
        int intDecimal = (int) decimal;

        numToWords += " and " + Integer.toString(intDecimal) + "/100";
        //***********************************************************//

        // returns concatenated string of values *******************//
        return numToWords;
    }
}