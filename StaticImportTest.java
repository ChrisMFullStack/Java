// Exercise 8.09
// Rewrite the code in Fig.8.14 to use a separate import declaration for each 
// static member of class Math that’s used in the example.

import static java.lang.Math.sqrt;
import static java.lang.Math.ceil;
import static java.lang.Math.PI;
import static java.lang.Math.E;
import static java.lang.Math.log;
import static java.lang.Math.cos;;

public class StaticImportTest{
    public static void main(String[] args) {
        System.out.printf("sqrt(900.0) = %.1f%n", sqrt(900.0));
        System.out.printf("ceil(-9.8) = %.1f%n", ceil(-9.8));
        System.out.printf("E = %f%n", E);
        System.out.printf("PI = %f%n", PI);
        System.out.printf("log(E) = %.1f%n", log(E));
        System.out.printf("cos(0.0) = %.1f%n", cos(0.0));
    }
}