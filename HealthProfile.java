// Exercise 3.17
// Computerization of Health Records

import java.time.LocalDate;
import java.time.Period;

public class HealthProfile{
 
  private String firstname;
  private String secondname;
  private int birthYear;
  private int currentYear;
  private double weight;
  private double height;
  private String gender;
 
  public HealthProfile(String firstname, String secondname, double weight, double height, int birthYear, int currentYear, String gender) {
    this.setFirstname(firstname);
    this.setSecondname(secondname);
    this.setWeight(weight);
    this.setHeight(height);
    this.setBirthYear(birthYear);
    this.setCurrentYear(currentYear);
    this.setGender(gender);
  }
   
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getSecondname() {
    return secondname;
  }

  public void setSecondname(String secondname) {
    this.secondname = secondname;
  }
 
  public double getWeight() {
    return weight;
  }
  
  public void setWeight(double weight) {
    this.weight = weight;
  }
 
  public double getHeight() {
    return height;
  }
 
  public void setHeight(double height) {
    this.height = height;
  }

  public int getBirthYear() {
    return birthYear;
  }

   public int getCurrentYear() {
    return currentYear;
  }

  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }

  public void setCurrentYear(int currentYear) {
    this.currentYear = currentYear;
  }

   public int getAge() {
    return currentYear - birthYear;
  }

  public double BMI(){
    this.getWeight();
    this.getHeight();
    double bmi=(getWeight() * 703) / (getHeight() * getHeight());
      return bmi;
  }
 
  public String getGender() {
    return gender;
  }
 
  public void setGender(String gender) {
    this.gender = gender;
  }
 
  public int maxHeartRate() {
	  int maxHR = 220 - getAge();
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