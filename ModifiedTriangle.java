// Exercise 5.22
// Modified Triangle-Printing Program

public class ModifiedTriangle{
    public static void main(String[] args) {
        int countA = 1;
        int countB = 10;
        for (int h=1; h<= 10; h++) { 
                  
            //prints left triangle
            for (int i=1; i<= 10; i++) {
                if(countA >= i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\t");

            // prints center left triangle            
            for (int i=1; i<= 10; i++) {
                if(countB >= i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\t");

            // prints center right triangle
            for (int i=1; i<= 10; i++) {
                if(countA > i) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }            
            System.out.print("\t");
            
            // prints right triangle
            for (int i=1; i<= 10; i++) {
                if(countB > i) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            
            countB--;
            countA++;
            
            System.out.println();            
        
        } 
         
   } 
    
}