// Exercise 7.18
// (Game of Craps) Write an application that runs 1,000,000 games of craps
// Answer to question #5) Your chance of winning decreases after the first throw

import java.security.SecureRandom;
import java.util.ArrayList;

public class GameofCraps{

    private static final SecureRandom randomDie = new SecureRandom();

    private enum Status {CONTINUE, WON, LOST};
    

    public static void main(String[] args) {
        // Calls the "oneMillionCraps" method
        oneMillionCraps();
    }
    // Method randomly generats two numbers from 1 to 6 and sums them
    public static int rollDice(){
        
            int dice1 = 1 + randomDie.nextInt(6);
            int dice2 = 1 + randomDie.nextInt(6);
            int sum= dice1 + dice2;

            return sum;        
    }   
    // Method for the 1,000,000 games of craps
    public static void oneMillionCraps(){
        Status gameStatus;
        int point = 0;
        int[] winArray = new int[22];
        int[] lossArray = new int[22];
        int wins = 0;
        int loss = 0;
        int gameCounter = 0;
        int gameLength =0;

        // loop calls to the roll dice method 1 million times and passes the results to a switch
        for (int i = 0; i < 1_000_000; i++){
            int sumOfDice = rollDice();
            int rollCount = 1;
            // switch determines if each first dice roll per game is a win, loss or to continue game
            switch (sumOfDice){
                case 7:
                case 11:
                    gameStatus = Status.WON;
                    break;
                case 2:
                case 3:
                case 12:
                    gameStatus = Status.LOST;
                    break;
                default:
                    point = sumOfDice;
                    gameStatus = Status.CONTINUE;
                    break;
            }
            // Loop continues to roll dice until game comes to an end 
            while (gameStatus == Status.CONTINUE){
                sumOfDice = rollDice();
                ++rollCount;
                if(sumOfDice == point){
                    gameStatus = Status.WON;
                }else{
                    if (sumOfDice == 7){
                        gameStatus = Status.LOST;
                    }
                }                
            }
            // Counters to count how many rolls each game takes
            if (rollCount > 21){
                rollCount = 21;
            }
            // counter for counting wins and losses and arrays for storing game results
            if (gameStatus == Status.WON){
                ++winArray[rollCount];
                ++wins;
                ++gameCounter;
            }else{
                ++lossArray[rollCount];
                ++loss;
                ++gameCounter;
            }
        }
        // Loops through wins and losses and determins how many rolls each game took
        for (int i = 1; i <= 21; ++i){
            gameLength += (i * winArray[i] + i * lossArray[i]);

            //Outputs wins and losses for each number of rolls 
            if (i < 21){
                System.out.printf("%d games won and %d games lost on roll #%d\n", winArray[i], lossArray[i], i);
            }else{
                 System.out.printf("%d games won and %d games lost on rolls after 20th roll\n\n", winArray[i], lossArray[i]);
            }        
        }
            // Outputs chances of winning and average game length
            System.out.printf("The chances of winning are %d / 1000000 = %.2f%%\n", wins, (((double) wins/1000000) * 100));
            System.out.printf("The average game length is %.2f rolls.", ((double) gameLength / gameCounter));
    }
}