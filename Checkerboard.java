// Exercise 4.33
// Checkerboard Pattern of Asterisks

public class Checkerboard{

	public static void main(String[] args){

	    // variables for height and lenght of checkerboard
        int length = 15;
        int height = 7;

        // Iteration statements to print either space
        // or * until iteration completes
        for (int h = 0; h <= height; h++){
            if (h % 2 == 0){
                System.out.print("* ");
            }else{
                System.out.print(" ");
            }
        for (int l = 0; l <= length; l++){
            if (l % 2 == 0){
                System.out.print(" ");
            }else if (l != length || h % 2 != 0){
                System.out.print("* ");
            }
        }
        // Output statment to drop iteration to next line
        System.out.println("");
        }
    }
}