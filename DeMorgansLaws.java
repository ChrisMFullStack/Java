// Exercise 5.23
// De Morgan’s Laws

import java.util.Scanner;

public class DeMorgansLaws{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        
        // Outputs to user what expessions are being tested for De Morgan's Laws
        System.out.print("Testing De Morgans Laws in the following expressions: \n\n" +
        "!(x < 5) && !(y >= 7)\n" + 
        "!((x < 5) || (y >= 7)\n" + 
        "!(a == b) || !(g != 5)\n" + 
        "!((a == b) && (g != 5))\n" + 
        "!((x <= 8) && (y > 4))\n" + 
        "!(x <= 8) || !(y > 4)\n" + 
        "!((i > 4) || (j <= 6))\n" + 
        "!(i > 4) && !(j <= 6)\n\n");

        // Prompts user to input values into the expressions
        System.out.print("Enter the value for x: ");
        int x = input.nextInt();

        System.out.print("\nEnter the value for y: ");
        int y = input.nextInt();
        
        System.out.print("\nEnter the value for a: ");
        int a = input.nextInt();
        
        System.out.print("\nEnter the value for b: ");
        int b = input.nextInt();
        
        System.out.print("\nEnter the value for g: ");
        int g = input.nextInt();
        
        System.out.print("\nEnter the value for i: ");
        int i = input.nextInt();
        
        System.out.print("\nEnter the value for j: ");
        int j = input.nextInt();
        
        // Boolean expressions that test the input values
        boolean a1 = !(x < 5) && !(y >= 7);
        boolean b1 = !((x < 5) || (y >= 7));
        boolean c1 = !(a == b) || !(g != 5);
        boolean d1 = !((a == b) && (g != 5));
        boolean e1 = !((x <= 8) && (y > 4));
        boolean f1 = !(x <= 8) || !(y > 4);
        boolean g1 = !((i > 4) || (j <= 6));
        boolean h1 = !(i > 4) && !(j <= 6);

        // Outputs the tested boolean expression values to be compared
        System.out.printf("\n!(x < 5) && !(y >= 7) is %b\n", a1);
        System.out.printf("!((x < 5) || (y >= 7)) is %b\n\n", b1);
        System.out.printf("!(a == b) || !(g != 5) is %b\n", c1);
        System.out.printf("!((a == b) && (g != 5)) is %b\n\n", d1);
        System.out.printf("!((x <= 8) && (y > 4)) is %b\n", e1);
        System.out.printf("!(x <= 8) || !(y > 4) is %b\n\n", f1);
        System.out.printf("!((i > 4) || (j <= 6)) is %b\n", g1);
        System.out.printf("!(i > 4) && !(j <= 6) is %b\n\n", h1);

    }
    
}