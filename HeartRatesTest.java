// Exercise 3.16
// Target-Heart-Rate Calculator

import java.time.LocalDate;
import java.util.Scanner;

public class HeartRatesTest {
   	public static void main( String[] args ){
    	LocalDate date = LocalDate.of(1911, 1, 1);
    	HeartRates thr = new HeartRates("", "", date);
		
      	Scanner input = new Scanner(System.in);

		//prompts the user to enter his/her first name
   		System.out.print("Enter your first name: ");
	   	String first = input.nextLine();
	   	thr.setFirstName(first);

		//prompts the user to enter his/her last name
	   	System.out.print("Enter your last name: ");
	   	String last = input.nextLine();
	   	thr.setLastName(last);

	   	//calls setDateOfBirth method, prompting the user to enter his/her birth date
	   	thr.setDateOfBirth();

	   	//prints first and last name
	   	System.out.printf("\nFirst Name: %s%n", thr.getFirstName());
	   	System.out.printf("Last Name: %s%n", thr.getLastName());
		
	   	//prints the age
	   	System.out.printf("Age: %d%n", thr.calcAge());

      	//prints maximum heart rate
	   	System.out.printf("Maximum heart rate: %d%n", thr.maxHeartRate());

    	//prints target heart rate
	   	System.out.printf("Target heart rate range: %n  Minimum: %d%n  Maximum:%d", thr.tarHeartRate1(), thr.tarHeartRate2());
		
	}
}