// Exercise 6.24
// Perfect Numbers

import java.util.Stack;

public class PerfectNumbers{
    public static void main(String[] args) {
    
        for (int i = 1; i < 1000; i++){
            int number = i;        
            
            // recieves output from isPerfect method, if true it prints
            // recieves the stack output from the factors method and diplays them
            if (isPerfect(number)){
                System.out.println(number + " is perfect.");             
                System.out.print("\tFactors: ");
                factors(number);
                System.out.println();                                 
            }else{
                ;
            }
                       
        } 
    }
    // Method "isPerfect" takes the output from the "main" for loop (1 -1000) and returns true or false 
    public static boolean isPerfect(int number) {
        int sum = 0;
               
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
    // Method "factors" takes the output from the "main" for loop (1 -1000) takes the factors from the 
    // perfect numbers, loads them in a stack to be output
    public static void factors(int number){
        for(int j = 1; j < number; j++){
            Stack<Integer> STACK = new Stack<Integer>();
            if(number % j == 0){                 
                STACK.push(j);                            
            }
            while (!STACK.isEmpty()){
            System.out.printf("%d ", STACK.pop());
            }
        } 
    }    
}
