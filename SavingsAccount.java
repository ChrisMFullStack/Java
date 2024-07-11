// Exercise 8.06
// (Savings Account Class) Create class SavingsAccount. Use a static variable 
// annualInterestRate to store the annual interest rate for all account holders.

public class SavingsAccount{

    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double annualInterestRate, double savingsBalance){
        SavingsAccount.annualInterestRate = annualInterestRate;
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance(){return savingsBalance;}

    public double getAnnualInterestRate(){return annualInterestRate;}

    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double calculateMonthlyInterest(double...SavingsAccount){
        double monthyInterest = ((getSavingsBalance() * getAnnualInterestRate()) / 12);
        savingsBalance = savingsBalance + monthyInterest;
       
        return savingsBalance;
    } 

    public static double modifyInterestRate(double savingsBalance){
        annualInterestRate = 0.05;
        double monthyInterest = ((getSavingsBalance * annualInterestRate) / 12);
        savingsBalance = savingsBalance + monthyInterest;
        return savingsBalance;
    } 
    
    public static void modifyInterestRate(SavingsAccount saver){
        double annualInterestRate = 0.05;
        double monthyInterest = ((saver.getSavingsBalance() * annualInterestRate) / 12);
        System.out.printf("$%.2f\t", (saver.getSavingsBalance() + monthyInterest));
    } 
}
