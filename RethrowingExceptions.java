// Exercise 11.20
// (Rethrowing Exceptions) Write a program that illustrates rethrowing an exception.

public class RethrowingExceptions{
    public static void main(String[] args) {

        try {
            someMethod();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static void someMethod() throws Exception{
        try {
            someMethod2();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void someMethod2() throws Exception{
        throw new Exception("Exception thrown in someMethod2");
    }

}
