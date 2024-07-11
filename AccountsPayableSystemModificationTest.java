// Exercise 10.16_17_18
// (Accounts Payable System Modification); (Recommended Project: Combining Composition and Inheritance4)
// (Recommended Project: Implementing the Payable Interface) 

// Fig. 10.14: PayableInterfaceTest.java 
// Payable interface test program processing Invoices and 
// Employees polymorphically. 
public class AccountsPayableSystemModificationTest{ 
   public static void main(String[] args) { 
      // create four-element Payable array 
      Payable[] payableObjects = new Payable[] { 
         new Invoice("01234", "seat", 2, 375.00), 
         new Invoice("56789", "tire", 4, 79.95), 
      // create subclass objects      
         new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),      
         new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40),      
         new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06),      
         new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300)
      };

      System.out.println( 
         "Invoices and Employees processed polymorphically:"); 
 
      // generically process each element in array payableObjects 
      for (Payable currentPayable : payableObjects) { 
         
         // output currentPayable and its appropriate payment amount 
         System.out.printf("%n%s %n",currentPayable.toString()); // could invoke implicitly 

         // determine whether element is a BasePlusCommissionEmployee 
         if (currentPayable instanceof BasePlusCommissionEmployee) { 
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference 
            BasePlusCommissionEmployee employee = 
               (BasePlusCommissionEmployee) currentPayable; 

            employee.setBaseSalary(1.10 * employee.getBaseSalary()); 

            System.out.printf( 
               "new base salary with 10%% increase is: $%,.2f%n", 
               employee.getBaseSalary()); 
         }          

         // output currentPayable and its appropriate payment amount 
         System.out.printf("payment due: $%,.2f%n", currentPayable.getPaymentAmount());
      } 
   } 
}

// Fig. 10.4: Employee.java 
// Employee abstract superclass. 

abstract class Employee implements Payable { 
   
   private final String firstName; 
   private final String lastName; 
   private final String socialSecurityNumber; 

   // constructor 
   public Employee(String firstName, String lastName, String socialSecurityNumber) { 
      this.firstName = firstName; 
      this.lastName = lastName; 
      this.socialSecurityNumber = socialSecurityNumber;
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
      return String.format("%s %s%nsocial security number: %s", 
      getFirstName(), getLastName(), getSocialSecurityNumber()); 
   } 

   // abstract method must be overridden by concrete subclasses
   public abstract double getPaymentAmount(); // no implementation here
}

// Fig. 10.5: SalariedEmployee.java 
// SalariedEmployee concrete class extends abstract class Employee. 

class SalariedEmployee extends Employee {
    private double weeklySalary; 

    // constructor 
    public SalariedEmployee(String firstName, String lastName, 
        String socialSecurityNumber, double weeklySalary) { 
        super(firstName, lastName, socialSecurityNumber); 

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

     // calculate getPaymentAmount; override abstract method getPaymentAmount in Employee
     @Override
     public double getPaymentAmount() {return getWeeklySalary();}

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
        String socialSecurityNumber, double wage, double hours) { 
        super(firstName, lastName, socialSecurityNumber); 

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

     // calculate getPaymentAmount; override abstract method getPaymentAmount in Employee
     @Override
     public double getPaymentAmount() { 
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
        String socialSecurityNumber, double grossSales, 
        double commissionRate) { 
        super(firstName, lastName, socialSecurityNumber); 

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

      // calculate getPaymentAmount; override abstract method getPaymentAmount in Employee
      @Override
      public double getPaymentAmount() { 
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
        String socialSecurityNumber, double grossSales, 
        double commissionRate, double baseSalary) { 
        super(firstName, lastName, socialSecurityNumber, 
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

     // calculate getPaymentAmount; override method getPaymentAmount in CommissionEmployee
     @Override
     public double getPaymentAmount() {return getBaseSalary() + super.getPaymentAmount();}

     // return String representation of BasePlusCommissionEmployee object
     @Override
     public String toString() {
        return String.format("%s %s; %s: $%,.2f",
           "base-salaried", super.toString(),
           "base salary", getBaseSalary());
     }
  }

// Fig. 10.11: Payable.java 
// Payable interface declaration.

interface Payable { 
     public abstract double getPaymentAmount(); // no implementation
}

// Fig. 10.12: Invoice.java 
// Invoice class that implements Payable. 

class Invoice implements Payable { 
   private final String partNumber; 
   private final String partDescription; 
   private final int quantity; 
   private final double pricePerItem; 

     // constructor
     public Invoice(String partNumber, String partDescription, int quantity, 
        double pricePerItem) { 
        if (quantity < 0) { // validate quantity 
           throw new IllegalArgumentException("Quantity must be >= 0"); 
        } 

        if (pricePerItem < 0.0) { // validate pricePerItem 
           throw new IllegalArgumentException( 
              "Price per item must be >= 0"); 
        } 

        this.quantity = quantity; 
        this.partNumber = partNumber; 
        this.partDescription = partDescription; 
        this.pricePerItem = pricePerItem; 
     } 

     // get part number 
     public String getPartNumber() {return partNumber;} 

     // get description 
     public String getPartDescription() {return partDescription;} 

     // get quantity 
     public int getQuantity() {return quantity;} 

     // get price per item 
     public double getPricePerItem() {return pricePerItem;} 

     // return String representation of Invoice object
     @Override 
     public String toString() { 
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", 
           "invoice", "part number", getPartNumber(), getPartDescription(), 
           "quantity", getQuantity(), "price per item", getPricePerItem()); 
      }

     // method required to carry out contract with interface Payable
     @Override
     public double getPaymentAmount() {
        return getQuantity() * getPricePerItem(); // calculate total cost
      }
}

