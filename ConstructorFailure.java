// Exercise 11.19
// (Constructor Failure) Write a program that shows a constructor passing information about 
// constructor failure to an exception handler.

public class ConstructorFailure{
    public static void main(String[] args) {

        int a = 1;

        SomeClass test;

        try {
            test = new SomeClass(a);            
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        
    }
}

class SomeClass{
    int num1;

    public SomeClass(){

    }

    public SomeClass(int num1) throws Exception{

        throw new Exception("java.lang.Exception");

    }
}