// Exercise 3.16
// Target-Heart-Rate Calculator

import java.time.*;
import java.util.Scanner;

public class HeartRates {
   private String firstName;
   private String lastName;
   private LocalDate dateOfBirth;
    
   // Date date1 = new Date(0,0,0);
   public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.dateOfBirth = dateOfBirth;
   }
   //method gets first name
   public String getFirstName() {
      return firstName;
   }
   //method gets last name
   public String getLastName() {
      return lastName;
   }
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   //method sets last name
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   //method gets the date of birth
   public LocalDate getDateOfBirth() {
      return dateOfBirth;
   }
   //method sets the date of birth
   public void setDateOfBirth() {
   
   //create Scanner object
	Scanner input = new Scanner(System.in);
	
   //prompts user to enter birth Year 
	System.out.print("Enter your Year of birth: ");
   int year = input.nextInt();

	//prompts user to enter birth month
	System.out.print("Enter your month of birth: ");
	int month = input.nextInt();
		
	//prompts user to enter birth day
	System.out.print("Enter your Day of birth: ");
	int day = input.nextInt();
        
   LocalDate birth = LocalDate.of(year, month, day);

	dateOfBirth = birth;
   }

   //this method calculates the age of the user
   public int calcAge() {
	   LocalDate today = LocalDate.now();
	   Period p = Period.between(dateOfBirth, today);
	   int age = p.getYears();
	      return age;
	}
    
   //method calculates the maximum heart rate
   public int maxHeartRate() {
	   int maxHR = 220 - calcAge();
         return maxHR;
	}

   public int tarHeartRate1() {
	   double tarHR1 = maxHeartRate() * 0.5;
	      return (int)tarHR1;
	}

   public int tarHeartRate2() {
	   double tarHR2 = maxHeartRate() * 0.85;
	      return (int)tarHR2;
	
   }    
}