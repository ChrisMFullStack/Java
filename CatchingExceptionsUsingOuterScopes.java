// Exercise 11.21
// (Catching Exceptions Using Outer Scopes) Write a program showing that a method with its own 
// try block does not have to catch every possible error generated within the try.

import java.io.IOException;

public class CatchingExceptionsUsingOuterScopes{
    public static void main(String[] args) {

        someMethod();
        
    }

    public static void someMethod(){
        try {
            ExceptionA();
        } catch (Exception e) {
            System.out.print(e.toString() + " caught in someMethod");
        }
    }

    
    public static void ExceptionA() throws Exception{
        try {
            throw new IOException();
        } catch (NullPointerException e) {
            System.out.print("Exception ExceptionA caught");
        }
    }
    
}