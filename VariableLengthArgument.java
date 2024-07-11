// Exercise 7.14
// (Variable-Length Argument List) Write an application that calculates the product of 
// a series of integers that are passed to method product using a variable-length argument list. 

public class VariableLengthArgument{
        public static void main(String[] args){        
        
        System.out.println("a = 1, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7\n");
        // declared variables
        int a = 1, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7;
        // Calls to and then outputs the result of product method 
        System.out.printf("The product of a and b is: %d\n", product(a, b));

        System.out.printf("The product of a, b, and c is: %d\n", product(a, b, c));

        System.out.printf("The product of a, b, c, and d is: %d\n", product(a, b, c, d));

        System.out.printf("The product of a, b, c, d, and e is: %d\n", product(a, b, c, d, e));

        System.out.printf("The product of a, b, c, d, e, and f is: %d\n", product(a, b, c, d, e, f));

        System.out.printf("The product of a, b, c, d, e, f, and g is: %d\n", product(a, b, c, d, e, f, g));
    }
    // Method product takes the number varables listed in main and finds the product when called upon
    public static int product(int...numbers){
        int multiple = 1;

        for(int number : numbers){
            multiple *= number;
        }
        return multiple;
    }
}