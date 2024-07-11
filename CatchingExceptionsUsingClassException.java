// Exercise 11.17
// (Catching Exceptions Using Class Exception) Write a program that demonstrates 
// how various exceptions are caught with catch (Exception exception)

import java.io.IOException;

public class CatchingExceptionsUsingClassException{
    public static void main(String[] args) {

        String point = null;

        try {
            getExceptionA();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            getExceptionB();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            if (point.equals("something")){
                System.out.print("something");
            }            
        } catch (NullPointerException e) {
            System.out.println("java.lang.NullPointerException");
        }

        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.print("java.io.IOException");
        }        
    }

public static void getExceptionA() throws ExceptionA{
    throw new ExceptionA("ExceptionA");
}

public static void getExceptionB() throws ExceptionB{
    throw new ExceptionB("ExceptionB");
}
    
}

class ExceptionA extends Exception{

    public ExceptionA(String message){
        super(message);
    }
}

class ExceptionB extends ExceptionA{

    public ExceptionB(String message){
        super(message);
    }
}