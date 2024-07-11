// Exercise 9.3
// (Recommended: Using Composition Rather Than Inheritance) Rewrite class BasePlus–CommissionEmployee 

// Fig. 9.7: BasePlusCommissionEmployeeTest.java
// BasePlusCommissionEmployee test program.

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {        
        // composition using instance variables from CommissionEmployee
        CommissionEmployee cp = new CommissionEmployee("Bob", "Lewis", "333-33-333", 5000, 0.04);
        // instantiate BasePlusCommissionEmployee object
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(cp, 300);

        // get base-salaried commission employee data
        System.out.printf(
           "Employee information obtained by get methods:%n");
        System.out.printf("%s %s%n", "First name is",
            cp.getFirstName());
        System.out.printf("%s %s%n", "Last name is",
            cp.getLastName());
        System.out.printf("%s %s%n", "Social security number is",
            cp.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is",
            cp.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is",
            cp.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is",
            employee.getBaseSalary());

        employee.setBaseSalary(1000);

        System.out.printf("%n%s:%n%n%s%s%n",
            "Updated employee information obtained by toString",
            cp.toString(), employee.toString());
    }
}