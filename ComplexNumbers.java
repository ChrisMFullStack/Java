// Exercise 8.11
// (Complex Numbers) Create a class called Complex for performing arithmetic with complex numbers.

public class ComplexNumbers{
    
    private double real;
    private double imagin;

    public ComplexNumbers(double real, double imagin){
        this.real = real;
        this.imagin = imagin;
    }

    public void viewNumbers(){
        System.out.println("(" + this.real + ", " + this.imagin + ")");
    }

    public static ComplexNumbers add(ComplexNumbers num1, ComplexNumbers num2){

        ComplexNumbers addition = new ComplexNumbers(0, 0);

        addition.real = num1.real + num2.real;

        addition.imagin = num1.imagin + num2.imagin;

        return addition;
    }

    public static ComplexNumbers sub(ComplexNumbers num1, ComplexNumbers num2){

        ComplexNumbers sub = new ComplexNumbers(0, 0);

        sub.real = num1.real - num2.real;

        sub.imagin = num1.imagin - num2.imagin;

        return sub;
    }
}