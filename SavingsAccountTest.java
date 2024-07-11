// Exercise 8.06
// (Savings Account Class) Create class SavingsAccount. Use a static variable 
// annualInterestRate to store the annual interest rate for all account holders.

public class SavingsAccountTest {
    public static void main(String[] args){
        
        SavingsAccount saver1 = new SavingsAccount(0.04, 2000.00);
        SavingsAccount saver2 = new SavingsAccount(0.04, 3000.00);

        System.out.print("Monthly balances for one year at .04\nBalances:\n");

        System.out.print("\t\t Saver 1\t Saver 2\n");
        System.out.printf("Base\t\t$%.2f\t$%.2f\n", saver1.getSavingsBalance(), saver2.getSavingsBalance());

        for (int month = 1; month <=12; month++){
            System.out.printf("Month %d:\t$%.2f\t$%.2f\n", month, saver1.calculateMonthlyInterest(null), saver2.calculateMonthlyInterest(null));
        }       

        System.out.print("\nAfter setting interest rate to .05 and calculating monthly interest\nBalances:\n");
        System.out.print("Saver 1\t\t Saver 2\n");

        SavingsAccount.modifyInterestRate(saver1);
        SavingsAccount.modifyInterestRate(saver2);
    } 
}

// Exercise 8.06
// (Savings Account Class) Create class SavingsAccount. Use a static variable 
// annualInterestRate to store the annual interest rate for all account holders.

class SavingsAccount{

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
