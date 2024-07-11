// Exercise 8.04
// (Rectangle Class) Create a class Rectangle with attributes length and width, each of which defaults to 1.

import java.util.Scanner;

public class RectangleClassTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = 0;

        // creat instance of the RectangleClass
        RectangleClass rectangle = new RectangleClass();
        
        // loop while choice 3 is not selected
        while (choice != 3){
            System.out.print("1. Set Length\n2. Set Width\n3. Exit\nChoice: ");
            choice = input.nextInt();

            // switch takes choice response and initiates methods from RectangleClass file
            switch (choice){
                case 1: 
                    System.out.print("Enter length: ");
                    double length = input.nextDouble();
                    try {
                        rectangle.setLength(length);
                    }catch (IllegalArgumentException e){
                        System.out.printf("\nException while setting lenght: %s\n\n", e.getMessage());
                        break;
                    }                    
                    System.out.printf("Length: %.6f", rectangle.getLength());
                    System.out.printf("\nWidth: %.6f\n", rectangle.getWidth());
                    System.out.printf("Perimeter: %.6f\n", rectangle.perimeter());
                    System.out.printf("Area: %.6f\n\n", rectangle.area());
                    break;
                case 2:
                    System.out.print("Enter width: ");
                    double width = input.nextDouble();
                    try {       
                        rectangle.setWidth(width);
                    }catch (IllegalArgumentException e){
                        System.out.printf("\nException while setting width: %s\n\n", e.getMessage());
                        break;
                    }
                    System.out.printf("Length: %.6f", rectangle.getLength());
                    System.out.printf("\nWidth: %.6f\n", rectangle.getWidth());
                    System.out.printf("Perimeter: %.6f\n", rectangle.perimeter());
                    System.out.printf("Area: %.6f\n\n", rectangle.area());
                    break;
                case 3:
                    break;
                default :
                    break;
            }

        }

    }
}

// Exercise 8.04
// (Rectangle Class) Create a class Rectangle with attributes length and width, each of which defaults to 1. 

class RectangleClass{

    private double width = 1;
    private double length = 1;

    // get method for length
    public double getLength(){return length;}
    // get method for width
    public double getWidth(){return width;}

    // set method for length
    public void setLength(double length){
        if (length < 0.0 || length > 20.0){
            throw new IllegalArgumentException("Length must be larger than 0.0 and less than 20.0");
        }else{
            this.length = length;
        }
        
    }
    // set method for width
    public void setWidth(double width){
        if (width < 0.0 || width > 20.0){
            throw new IllegalArgumentException("Width must be larger than 0.0 and less than 20.0");
        }else{
            this.width = width;
        }
        
    }

    // method for calculating area
    public double area(){
        return (length * width);
    }

    // method for calculating perimeter
    public double perimeter(){
        return ((length + width) * 2);
    }
    
}