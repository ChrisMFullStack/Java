// Exercise 6.28
// Write a method qualityPoints that inputs a student’s average and 
//returns 4 if it’s 90–100, 3 if 80–89, 2 if 70–79, 1 if 60–69 and 0 if lower than 60.

import java.util.Scanner;

public class QualityPoints{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int average = 0;

        while (average != -1){
            System.out.print("Enter average (-1 to quit): ");
            average = input.nextInt();
            if (average != -1){
                System.out.printf("Point is: %d\n\n", qualityPoints(average));
            }
        }
    }
    public static int qualityPoints(int average){
        if (average <= 100 && average >= 90){
            return 4;
        }
        else if (average <= 89 && average >= 80){
            return 3;
        }
        else if (average <= 79 && average >= 70){
            return 2;
        }
        else if (average <= 69 && average >= 60){
            return 1;
        }else{
            return 0;
        }
    }
}