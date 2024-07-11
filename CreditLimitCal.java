// Exercise 4.18
// Credit Limit Calculator

import java.util.Scanner;

public class CreditLimitCal{

	public static void main(String[] args){

	Scanner input = new Scanner (System.in);

	int account = 1, balance,charges,credits,creditLimit;

	// Loop for entering information while account number does not = 0
    while( account != 0 ){

		System.out.println();
		System.out.print("Enter Account Number: ");
		account = input.nextInt();
		if (account == 0){
			System.out.print("\nEnter valid account number! \n");
			break;
		}
		          
		System.out.print("Enter Beginning Balance: ");
		balance = input.nextInt();
		System.out.print("Enter Charges: ");
		charges = input.nextInt();
		System.out.print("Enter Credits: ");
		credits = input.nextInt();
		System.out.print("Enter Credit Limit: ");
		creditLimit = input.nextInt();
	
		// Calculate new balance using (beginning balance + charges – credits)
        double newbalance = balance + charges - credits;

		// Output for new balance
		System.out.printf("New Balnce is: %.2f%n", newbalance);
        
		// Output if credit exceeded
			if (newbalance > creditLimit){
			System.out.println("\nCredit Limit Exceeded!\n");
				break;
			}			
	}
	}
}