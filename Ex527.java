// Exercise 5.27
// What does the following program segment do?

public class Ex527{
    public static void main(String[] args) {

        int i, j, k = 0;
        
        // First for loop tells the second loop to run 5 times
        for (i = 1; i <= 5; i++) {
            // The second for loop tells the third loop to run 3 times
            for (j = 1; j <= 3; j++) {
                // The thrid loop tell the program to print 4 asterisks in a single line
                for (k = 1; k <= 4; k++) {
                    System.out.print('*');
                }
            // This println() tells the loop to drop to the next line after 
            // cycling the second loop once and all the third loop printing 4 asterisks     
            System.out.println();
        }
        // This println() tells the loop to drop to the next line after
        // one cycle of the first loop printing 3 rows of 4 asterisks
        System.out.println();
        }
    }
}