// Exercise 8.13 and 8.14
// (Set of Integers) Create class IntegerSet. Each IntegerSet object can hold integers in the range 0–100.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class IntegerSetTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        IntegerSet set = new IntegerSet(500, 500);

        int num1 = 0;
        int num2 = 0;

        // prompts user to input numbers to set A
        System.out.println("Input Set A");
        while (num1 != -1){
            System.out.print("Enter a number(-1 to end): ");
            num1 = input.nextInt();
            //adds input numbers to list
            set.setSet1(num1);
        }

        // prompts user to input numbers to set B
        System.out.println("Input Set B");
        while (num2 != -1){
            System.out.print("Enter a number(-1 to end): ");
            num2 = input.nextInt();
            // adds input numbers to list
            set.setSet2(num2);
        }

        // outputs the values set to true
        System.out.print("Set A contains elements:\n");
        set.set1ToString();

        // outputs the values set to true
        System.out.print("\nSet B contains elements:\n");
        set.set2ToString();

        // outputs combined list of Set A and B        
        System.out.println("\nUnion of Set A and Set B contains elements:");  
        IntegerSet.union();   

        // outputs number if Set A and B have the same value
        System.out.println("\nIntersection of Set A and Set B contains elements:");
        IntegerSet.intersection();

        // outputs if sets are equal or not
        set.isEqualTo();
        
        // add and delet element
        set.insertElement();
        set.deleteElement();

        //set new list of elements
        System.out.println("\nNew Set contains elements:");
        set.newSet();


    }
}

// Exercise 8.13 and 8.14
// (Set of Integers) Create class IntegerSet. Each IntegerSet object can hold integers in the range 0–100.



class IntegerSet{

    private int num1;
    private int num2;

    private static boolean[] set1 = new boolean[101];
    private static boolean[] set2 = new boolean[101];
    private static boolean[] union = new boolean[101];
      
    public IntegerSet(int number){

    }

    public IntegerSet(int num1, int num2){
     
    }

    // sets set 1 elements to true if valid
    public void setSet1(int num1){
        this.num1 = num1;
        for (int i = 0; i <= 100; i++){
            if (num1 == i){
                set1[i] = true;
            }
        }        
    }
    // sets set 2 elements to true if valid
    public void setSet2(int num2){
        this.num2 = num2;
        for (int i = 0; i <= 100; i++){
            if (num2 == i){
                set2[i] = true;
            }
        }        
    }    

    //prints set 1 elements
    public void set1ToString(){
        
        for (int i = 0; i <= 100; i++){
            if (set1[i] == true){
                System.out.printf("%d ", i);
            }
        }
        
        
    }

    //prints set 2 elements
    public void set2ToString(){
        for (int i = 0; i <= 100; i++){
            if (set2[i] == true){
                System.out.printf("%d ", i);
            }
        }
    }    

    public void insertElement(){
        System.out.println("\nInserting 77 into set A...");
            set1[77] = true;
        // outputs the values set to true
        System.out.println("Set A now contains elements:");
            set1ToString();
    } 

    public void deleteElement(){
        System.out.println("\nDeleting 77 from set A...");
            set1[77] = false;            
        // outputs the values set to true
        System.out.println("Set A now contains elements:");
            set1ToString();
    } 

    // outputs number if Set A and B have the same value
    public static void intersection(){    
        for (int i = 0; i <= 100; i++){
            if (set1[i] == true && set2[i] == true){
                System.out.printf("%d ", i);
            }            
        } 
        System.out.println();
    }

    // outputs combined list of Set A and B
    public static void union(){

        for (int i = 0; i <= 100; i++){
            if (set1[i] == true){union[i] = true;}
            if (set2[i] == true){union[i] = true;}
        }
        for (int i = 0; i <= 100; i++){
            if (union[i] == true){
                System.out.printf("%d ", i);
            }
        }
    }

    // tests if sets are equal
    public void isEqualTo(){
        if (set1.equals(set2)){
            System.out.print("Set A is equal to set B");
        }else{
            System.out.print("Set A is not equal to set B");
        }
    } 

    // set new set of elements
    public void newSet(){
        for (int i = 0; i <=100; i++){
            set1[i] = false;
        }
        for (int i = 0; i <=100; i++){            
            if (i % 5 == 0){
                set1[i] = true;
            }
        }
        set1ToString();
    }
}