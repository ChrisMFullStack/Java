// Exercise 5.13
// Factorials of 1 through 20
// Calculating the factorial of 100 might be difficult 
// do to insufficient memory 

public class Factorials20{
    public static void main(String[] args) {                  
            
        long factor = 1;
        System.out.printf("%-8s%s\n\n", "n", "n!");        
        for (long i = 1; i <= 20; i++){  
            factor *= i;
            System.out.printf("%-8d%d%n", i, factor);
        }        
    }
}