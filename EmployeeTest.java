//Excercise 3.13
//EmployeeTest Class

public class EmployeeTest {
    public static void main(String[] arg){
    
    String firstN;
    String lastN;
    double sal;
        
    Employee employee1 = new Employee();
    Employee employee2 = new Employee();

    firstN = "Bob";
    lastN = "Jones";
    sal = 34500.00;
    
    employee1.setFirstName(firstN);
    employee1.setLastName(lastN);
    employee1.setSalary(sal);

    firstN = "Susan";
    lastN = "Baker";
    sal = 37809.00;

    employee2.setFirstName(firstN);
    employee2.setLastName(lastN);
    employee2.setSalary(sal);

    System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getSalary());
    
    System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f", employee2.getFirstName(), employee2.getLastName(), employee2.getSalary());

    System.out.print("\n\nIncreasing employee salaries by 10%\n");
    
    employee1.setSalary(employee1.getSalary() * 1.10); // adds 10% to Employee 1's salary
    employee2.setSalary(employee2.getSalary() * 1.10); // adds 10% to Employee 2's salary
    
    System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getSalary());
      
    System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f", employee2.getFirstName(), employee2.getLastName(), employee2.getSalary());

    }
}
