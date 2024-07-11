// Exercise 3.11
// Modified Account Class Withdraw

import java.util.Scanner;		

public class AccountTest311 {
    public static void main(String[] args) {
    Account311 account1 = new Account311("Jane Green", 50.00);
    Account311 account2 = new Account311("John Blue", -7.53);
	
    System.out.printf("%s balance: $%.2f%n",
        account1.getName(), account1.getBalance());
    System.out.printf("%s balance: $%.2f%n%n",
        account2.getName(), account2.getBalance());
        
    Scanner input = new Scanner(System.in);

    System.out.print("Enter withdrawl amount for account1: "); 
    double withdrawAmount = input.nextDouble(); 
    System.out.printf("%nsubtractinging %.2f from account1 balance%n%n",
        withdrawAmount);
    account1.withdraw(withdrawAmount); 

    System.out.printf("%s balance: $%.2f%n",
        account1.getName(), account1.getBalance());
    System.out.printf("%s balance: $%.2f%n%n",
        account2.getName(), account2.getBalance());

    System.out.print("Enter withdrawl amount for account2: "); 
        withdrawAmount = input.nextDouble(); 
    System.out.printf("%nsubtractinging %.2f from account2 balance%n%n",
        withdrawAmount);
        account2.withdraw(withdrawAmount); 
   
    System.out.printf("%s balance: $%.2f%n",
        account1.getName(), account1.getBalance());
    System.out.printf("%s balance: $%.2f%n%n",
        account2.getName(), account2.getBalance());
    }
}