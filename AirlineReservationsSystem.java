// Exercise 7.19
// (Airline Reservations System) Write an application to assign seats on each flight of the airline’s only plane (capacity: 10 seats).

import java.util.ArrayList;
import java.util.Scanner;

public class AirlineReservationsSystem{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int choice = 0;
    // Creat List to store seats
    ArrayList<Integer> firstClass = new ArrayList<>();
    ArrayList<Integer> economyClass = new ArrayList<>();
    // Loops fill first and economy class lists 1 - 10
    for (int i = 1; i <= 5; i++){
        firstClass.add(i);
    }
    for (int i = 6; i <= 10; i++){
        economyClass.add(i);
    }    

    // Runs program while seats are available
    while ((choice != -1)&&(firstClass.isEmpty() == false || economyClass.isEmpty() == false)){
        // Promts user to make a seat area selection
        System.out.print("Please type 1 for First Class\nPlease type 2 for Economy\n(Enter -1 to exit)\nchoice: ");
        choice = input.nextInt();

        if (choice != -1){
            switch (choice){
                case 1:
                    // Checks if first class seating is available
                    boolean answer = firstClass.isEmpty();
                    if (answer == false){
                        System.out.printf("First Class. Seat #%d\n\n", (firstClass.get(0)));
                        firstClass.remove(0);
                    }else{
                        // if first class seating is unavailable prompts user if they'd accept ecconomy class seating
                        System.out.print("First Class seating is full, is it acceptable to be placed in Economy Class?\n(1 for Yes or 0 for No): ");
                        int nextChoice = input.nextInt();
                            if (nextChoice == 1){
                                System.out.printf("Economy Class. Seat #%d\n\n", (economyClass.get(0)));
                                economyClass.remove(0);
                            }else if (nextChoice == 0 ){
                                System.out.print("Next flight leaves in 3 hours.\n\n");
                            }else{
                                System.out.print("Please enter valid selection.\n\n");
                            }
                    }
                    break;
                case 2:
                    // Checks if economy class seating is available
                    answer = economyClass.isEmpty();
                    if (answer == false){
                        System.out.printf("Economy Class. Seat #%d\n\n", (economyClass.get(0)));
                        economyClass.remove(0);
                    }else{
                        // if economy class seating is unavailable prompts user if they'd accept first class seating
                        System.out.print("Economy Class seating is full, is it acceptable to be placed in First Class?\n(1 for Yes or 0 for No): ");
                        int nextChoice = input.nextInt();
                            if (nextChoice == 1){
                                System.out.printf("First Class. Seat #%d\n\n", (firstClass.get(0)));
                                firstClass.remove(0);
                            }else if (nextChoice == 0 ){
                                System.out.print("Next flight leaves in 3 hours.\n\n");
                            }else{
                                System.out.print("Please enter valid selection.\n\n");
                            }
                    }
                    break;
                default:
                    System.out.print("Please enter valid selection.\n\n");
            }
        }
    }       
        // Outputs when all seats are filled
        if (firstClass.isEmpty() && economyClass.isEmpty()){
        System.out.print("All seats are filled, sorry for the inconvenience."); 
        }
    }  
}