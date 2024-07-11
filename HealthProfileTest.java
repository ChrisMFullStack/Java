// Exercise 3.17
// Computerization of Health Records

import java.util.Scanner;
import javax.swing.GroupLayout.Alignment;

public class HealthProfileTest {
    public static void main(String[] args) {
    
        HealthProfile profile = new HealthProfile(null, null, 0.0, 0.0, 0, 0, null);
  
        Scanner input = new Scanner(System.in);
  
        System.out.print("Enter your first name: ");
        String fn=input.next();
        profile.setFirstname(fn);
        System.out.print("Enter your last name: ");
        String ln=input.next();
        profile.setSecondname(ln);

        System.out.print("Enter gender : ");
        String gen=input.next();
        profile.setGender(gen);
    
        System.out.print("Enter Height in inches: ");
        double height=input.nextInt();
        profile.setHeight(height);
        System.out.print("Enter Weight in pounds: ");
        double weight=input.nextInt();
        profile.setWeight(weight);

        System.out.print("Enter year of birth: ");
        int birthYear=input.nextInt();
        profile.setBirthYear(birthYear);
        System.out.print("Enter current: ");
        int currentYear=input.nextInt();
        profile.setCurrentYear(currentYear);
            
        System.out.printf("%nHEALTH PROFILE FOR: %s %s%n",profile.getFirstname(),profile.getSecondname());
        System.out.printf("Gender: %s%n",profile.getGender());
        System.out.printf("Age: %d%n", profile.getAge());
        System.out.printf("Height (in inches): %.1f%n", profile.getHeight());
        System.out.printf("Weight (in pounds): %.1f%n", profile.getWeight());
        System.out.printf("Maximum heart rate: %d%n", profile.maxHeartRate());
	   	System.out.printf("Target heart rate range: %n  Minimum: %d%n  Maximum: %d%n", profile.tarHeartRate1(), profile.tarHeartRate2());
        System.out.printf("BMI: %f%n", profile.BMI());

        System.out.print("\nBMI VALUES\n");
        System.out.print("Underweight: less than 18.5\n");
        System.out.print("Normal:      between 18.5 and 24.9\n");
        System.out.print("Overweight:  between 25 and 29.9\n");
        System.out.print("Obese:       30 or greater\n");      
    }
 }