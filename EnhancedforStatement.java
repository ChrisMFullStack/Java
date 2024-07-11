// Exercise 7.16
//  (Using the Enhanced for Statement) Write an application that uses an 
// enhanced for statement to sum the double values passed by the command-line arguments.

public class EnhancedforStatement{
    public static void main(String[] args){

        Double total = 0.0;

        // Takes double values  passed from the command-line arguments and 
        // converts from string to double value then calculates the sum
        for(String number : args){
            total += Double.parseDouble(number);
        }
        // Outputs the total sum
        System.out.printf("Total is: %.2f\n", total);

    }    
}