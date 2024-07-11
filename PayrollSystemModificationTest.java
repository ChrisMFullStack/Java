// Exercise 10.13
// (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include 
// private instance variable birthDate in class Employee.

public class PayrollSystemModificationTest{
   public static void main(String[] args) {

      
      Date j = new Date(6, 15, 1944);
      Date k = new Date(12, 29, 1960);
      Date s = new Date(9, 8, 1954);
      Date b = new Date(3, 2, 1965);
      
   // create subclass objects
      SalariedEmployee salariedEmployee = 
         new SalariedEmployee("John", "Smith", "111-11-1111", j, 800.00);
      HourlyEmployee hourlyEmployee =
         new HourlyEmployee("Karen", "Price", "222-22-2222", k, 16.75, 40);
      CommissionEmployee commissionEmployee =
         new CommissionEmployee("Sue", "Jones", "333-33-3333", s, 10000, .06);
      BasePlusCommissionEmployee basePlusCommissionEmployee =
         new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", b, 5000, .04, 300);

      System.out.println("Employees processed individually:"); 

      System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings()); 
      System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings()); 
      System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings()); 
      System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings()); 

       

   } 
}

// Fig. 10.4: Employee.java 
// Employee abstract superclass. 

abstract class Employee { 
   
   private final String firstName; 
   private final String lastName; 
   private final String socialSecurityNumber; 
   // added private instance variable of Date class
   private Date date;

   // constructor 
   public Employee(String firstName, String lastName, String socialSecurityNumber, Date date) { 
      this.firstName = firstName; 
      this.lastName = lastName; 
      this.socialSecurityNumber = socialSecurityNumber; 
      this.date = date;
   } 

   // return first name 
   public String getFirstName() {return firstName;} 

   // return last name 
   public String getLastName() {return lastName;}

   // return social security number 
   public String getSocialSecurityNumber() {return socialSecurityNumber;} 

   // return String representation of Employee object 
   @Override 
   public String toString() { 
      return String.format("%s %s%nsocial security number: %s\nbirth date: %s", 
      getFirstName(), getLastName(), getSocialSecurityNumber(), date.toString()); 
   } 

   // abstract method must be overridden by concrete subclasses
   public abstract double earnings(); // no implementation here
}

// Fig. 10.5: SalariedEmployee.java 
// SalariedEmployee concrete class extends abstract class Employee. 

class SalariedEmployee extends Employee {
    private double weeklySalary; 

    // constructor 
    public SalariedEmployee(String firstName, String lastName, 
        String socialSecurityNumber, Date date, double weeklySalary) { 
        super(firstName, lastName, socialSecurityNumber, date); 

        if (weeklySalary < 0.0) { 
           throw new IllegalArgumentException( 
               "Weekly salary must be >= 0.0"); 
        } 

        this.weeklySalary = weeklySalary; 
     } 

     // set salary 
     public void setWeeklySalary(double weeklySalary) { 
        if (weeklySalary < 0.0) { 
           throw new IllegalArgumentException( 
               "Weekly salary must be >= 0.0"); 
        } 

        this.weeklySalary = weeklySalary; 
     } 

     // return salary 
     public double getWeeklySalary() {return weeklySalary;} 

     // calculate earnings; override abstract method earnings in Employee
     @Override
     public double earnings() {return getWeeklySalary();}

     // return String representation of SalariedEmployee object
     @Override
     public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f",
          super.toString(), "weekly salary", getWeeklySalary());
    }
}

// Fig. 10.6: HourlyEmployee.java 
  // HourlyEmployee class extends Employee. 

class HourlyEmployee extends Employee { 
     private double wage; // wage per hour 
     private double hours; // hours worked for week 

     // constructor 
     public HourlyEmployee(String firstName, String lastName, 
        String socialSecurityNumber, Date date, double wage, double hours) { 
        super(firstName, lastName, socialSecurityNumber, date); 

        if (wage < 0.0) { // validate wage 
           throw new IllegalArgumentException("Hourly wage must be >= 0.0"); 
        } 

        if ((hours < 0.0) || (hours > 168.0)) { // validate hours 
           throw new IllegalArgumentException( 
               "Hours worked must be >= 0.0 and <= 168.0"); 
        } 

        this.wage = wage; 
        this.hours = hours; 
     } 

     // set wage 
     public void setWage(double wage) { 
        if (wage < 0.0) { // validate wage 
           throw new IllegalArgumentException("Hourly wage must be >= 0.0"); 
        } 

        this.wage = wage; 
     } 

     // return wage 
     public double getWage() {return wage;} 

     // set hours worked 
     public void setHours(double hours) { 
        if ((hours < 0.0) || (hours > 168.0)) { // validate hours 
           throw new IllegalArgumentException( 
              "Hours worked must be >= 0.0 and <= 168.0"); 
        } 

        this.hours = hours; 
     } 

     // return hours worked 
     public double getHours() {return hours;} 

     // calculate earnings; override abstract method earnings in Employee
     @Override
     public double earnings() { 
        if (getHours() <= 40) { // no overtime
           return getWage() * getHours();
        } 
        else {
           return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
       }
     } 

     // return String representation of HourlyEmployee object 
     @Override
     public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
           super.toString(), "hourly wage", getWage(),
            "hours worked", getHours()); 
    } 
}

// Fig. 10.7: CommissionEmployee.java 
// CommissionEmployee class extends Employee. 

class CommissionEmployee extends Employee { 
     private double grossSales; // gross weekly sales 
     private double commissionRate; // commission percentage 

     // constructor 
     public CommissionEmployee(String firstName, String lastName, 
        String socialSecurityNumber, Date date, double grossSales, 
        double commissionRate) { 
        super(firstName, lastName, socialSecurityNumber, date); 

        if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
           throw new IllegalArgumentException( 
              "Commission rate must be > 0.0 and < 1.0"); 
        } 

        if (grossSales < 0.0) { // validate 
           throw new IllegalArgumentException("Gross sales must be >= 0.0"); 
        } 

        this.grossSales = grossSales; 
        this.commissionRate = commissionRate; 
      } 

      // set gross sales amount 
      public void setGrossSales(double grossSales) { 
         if (grossSales < 0.0) { // validate 
            throw new IllegalArgumentException("Gross sales must be >= 0.0"); 
         } 

         this.grossSales = grossSales; 
      } 

      // return gross sales amount 
      public double getGrossSales() {return grossSales;} 

      // set commission rate 
      public void setCommissionRate(double commissionRate) { 
         if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
            throw new IllegalArgumentException( 
               "Commission rate must be > 0.0 and < 1.0"); 
         } 

         this.commissionRate = commissionRate; 
      } 

      // return commission rate 
      public double getCommissionRate() {return commissionRate;} 

      // calculate earnings; override abstract method earnings in Employee
      @Override
      public double earnings() { 
         return getCommissionRate() * getGrossSales();
      }

      // return String representation of CommissionEmployee object
      @Override
      public String toString() {
         return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
            "commission employee", super.toString(),
            "gross sales", getGrossSales(),
            "commission rate", getCommissionRate());
    } 
}

// Fig. 10.8: BasePlusCommissionEmployee.java 
// BasePlusCommissionEmployee class extends CommissionEmployee. 

class BasePlusCommissionEmployee extends CommissionEmployee { 
     private double baseSalary; // base salary per week 

     // constructor 
     public BasePlusCommissionEmployee(String firstName, String lastName, 
        String socialSecurityNumber, Date date, double grossSales, 
        double commissionRate, double baseSalary) { 
        super(firstName, lastName, socialSecurityNumber, date, 
           grossSales, commissionRate); 

        if (baseSalary < 0.0) { // validate baseSalary  
           throw new IllegalArgumentException("Base salary must be >= 0.0"); 
        }   

        this.baseSalary = baseSalary;  
     } 

     // set base salary 
     public void setBaseSalary(double baseSalary) { 
        if (baseSalary < 0.0) { // validate baseSalary  
           throw new IllegalArgumentException("Base salary must be >= 0.0"); 
        } 

        this.baseSalary = baseSalary;  
     } 

     // return base salary 
     public double getBaseSalary() {return baseSalary;} 

     // calculate earnings; override method earnings in CommissionEmployee
     @Override
     public double earnings() {return getBaseSalary() + super.earnings();}

     // return String representation of BasePlusCommissionEmployee object
     @Override
     public String toString() {
        return String.format("%s %s; %s: $%,.2f",
           "base-salaried", super.toString(),
           "base salary", getBaseSalary());
     }
  }

// Fig. 8.7: Date.java
// Date class declaration.

class Date {
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year

    private static final int[] daysPerMonth =
        {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // constructor: confirm proper value for month and day given the year
    public Date(int month, int day, int year) {
        // check if month in range
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException(
            "month (" + month + ") must be 1-12");
        }

        // check if day in range for month
        if (day <= 0 ||
            (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");
        }

        // check for leap year if month is 2 and day is 29
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);
    }

    // return a String of the form month/day/year
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}