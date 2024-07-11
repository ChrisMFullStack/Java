// Exercise 5.21
// Pythagorean Triples

public class PythagoreanTriples{
    public static void main(String[] args) {
        
        int side1 = 500;
        int side2 = 500;
        int hypotenuse = 500;
        
        // loop cycles though side 1 numbers
        for (int i = 1; i <= side1; i++ ){
            // loop cycles though side 2 numbers
            for (int j = 1; j <= side2; j++){
                // loop cycles though hypotenuse numbers
                for (int k = 1; k <= hypotenuse; k++){
                    // Checks to see if looped values can
                    // be a right triangle
                    boolean trianglecheck = 
                        ((i * i) + (j * j) == (k * k));                       
                    // Outputs values deemed usable for right triangles
                    if (trianglecheck == true){
                        System.out.printf("%-6d%-6d%d\n\n", i, j, k);
                    }

                }
            }
        } 
    }
    
}