// Exercise 9.3
// (Recommended: Using Composition Rather Than Inheritance) Rewrite class BasePlus–CommissionEmployee 
// (Fig.9.11 ) of the CommissionEmployee–BasePlusCommissionEmployee hierarchy so that it contains a 
// reference to a CommissionEmployee object, rather than inheriting from class CommissionEmployee.

public class Employee {
    String firstName;
    String lastName;
    String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final void setSocialSecurityNumber(String socialSecurityNumber){

        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString(){

        return String.format("%s: %s%n%s: %s%n%s: %s%n", "first name", getFirstName(), "last name", getLastName(), "social security number", getSocialSecurityNumber());
    }
}