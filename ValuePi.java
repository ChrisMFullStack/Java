// Exercise 5.20
// Calculating the Value of Pi
// How many terms do you have to use before you first get a 
// value that begins with 3.14159?
// First value that begins with 3.14159 is 136121


public class ValuePi{
    public static void main(String[] args) {
        
        int terms = 1;

        // Loop for approximating Pi
        while (terms != 0){
            double term = 0.0;
            terms = 200000;
            double pi = 0.0;
            
            for (int i = 1; i <= terms; i++){
            
            if (i % 2 == 0){
                term = (double) -4/(2 * i - 1);
            }else{    
                term = (double) 4/(2 * i - 1);                
            }
            
            pi += term;
        
            // Prints table with term number and approximated Pi
            System.out.printf("%-10d%.16f\n", i, pi);

            // Breaks program when first value reaches 3.14159
            if (pi >= 3.14159 && pi < 3.14160){
                System.out.printf("First value that begins with 3.14159: %d", i);
                terms = 0;
                break;
            }
            }
        }       
    }
}