// Exercise 5.26
// Describe in general how you’d remove any break statement from 
//a loop in a program and replace it with some structured equivalent.
/*  You can remove a break statment by utilising if else statments. 
    Start with the "if" statment for the value you want the loop to use. 
    Then use the "else if" statment to output where you want it to stop. 
    A blank "else" statment can be used to do nothing. */

public class BreakTestWithoutBreak{
    public static void main(String[] args) {
        
        int count; // control variable also used after loop terminates
        

        for (count = 1; count <= 10; count++) { // loop 10 times
                if (count <= 4){
                    System.out.printf("%d ", count);
                }else if (count == 5){                                   
                    System.out.printf("\nBroke out of loop at count = %d", count);
                }else{
                    ;
                }
        }
    }
        
}