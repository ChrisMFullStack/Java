// Exercise 6.21
// Separating Digits

import java.util.Scanner;
import java.util.Stack;

public class SeparatingDigits{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num = 0;
        // loop prompting user to enter interger to be seperated
        while (num != -1){
            System.out.print("Enter an integer in the range 1-100000 (-1 to exit): ");
            num = input.nextInt();            
            
            displayDigits(num, num);
            System.out.println();      
        }
    }
    // method removes last number in interger
    public static int nextNum(int num){
        num = num / 10;
        return num;
    }
    // method returns last number in interger
    public static int remander(int num){
        int remNum = num % 10;
        return remNum;
    }
    // method loops using nextNum and remander methods pushing the 
    // remander into a stack, because the number are reversed and then 
    // popping them out in correct order
    public static void displayDigits(int remNum, int num){
        Stack<Integer> STACK = new Stack<Integer>();
        while (num > 0){                               
            remNum = remander(num);
            STACK.push(remNum);
            num = nextNum(num);
        }
        while (!STACK.isEmpty()){
        System.out.printf("%d  ", STACK.pop());
        }                       
    }
}