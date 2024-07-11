// Exercise 9.3
// (Recommended: Using Composition Rather Than Inheritance) Rewrite class BasePlus–CommissionEmployee 
// (Fig.9.11 ) of the CommissionEmployee–BasePlusCommissionEmployee hierarchy so that it contains a 
// reference to a CommissionEmployee object, rather than inheriting from class CommissionEmployee.

// Fig. 9.11: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee class inherits from CommissionEmployee
// and accesses the superclass’s private data via inherited
// public methods.

public class BasePlusCommissionEmployee{
private double baseSalary; // base salary per week
// composition using instance variables from CommissionEmployee
private CommissionEmployee commissionEmployee;

// composition using instance variables from CommissionEmployee
public BasePlusCommissionEmployee(CommissionEmployee cp, double baseSalary) {

    this.commissionEmployee = cp;

    // if baseSalary is invalid throw exception
    if (baseSalary < 0.0) { 
        throw new IllegalArgumentException("Base salary must be >= 0.0");
    }

    this.baseSalary = baseSalary;
    }

    // set base salary
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) { 
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary; 
    }

    // return base salary
    public double getBaseSalary() {return baseSalary;}

    // calculate earnings
    @Override
    public double earnings() {return getBaseSalary() + super.earnings();}

    // return String representation of BasePlusCommissionEmployee
    @Override
    public String toString() {
        return String.format("%s: %.2f", "base salary", getBaseSalary());
    }
}