// Exercise 5.28
// Describe in general how you’d remove any break statement from 
//a loop in a program and replace it with some structured equivalent.
/*  You can remove a Continue statment like a break statment by utilising 
    if else statments. Start with the "if" statment for the value you 
    want the loop to use. Then use the "else if" statment to output where 
    you want it to pause. A "else" statment can be used to continue the loop. */

public class ContinueTestWithoutContinue{
    public static void main(String[] args) {
        
        int count; // control variable also used after loop terminates
        

        for (count = 1; count <= 10; count++) { // loop 10 times
                if (count <= 4){
                    System.out.printf("%d ", count);
                }else if (count == 5){                                   
                    ;
                }else{
                    System.out.printf("%d ", count);
                }
        }
    }
        
}