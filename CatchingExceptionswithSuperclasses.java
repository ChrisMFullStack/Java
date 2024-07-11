// Exercise 11.16
// (Catching Exceptions with Superclasses) Use inheritance to create an exception 
// superclass (called ExceptionA) and exception subclasses ExceptionB and ExceptionC, 
// where ExceptionB inherits from ExceptionA and ExceptionC inherits from ExceptionB. 

public class CatchingExceptionswithSuperclasses{
    public static void main(String[] args) {
        try{
                getExceptionB();
            }catch(ExceptionA e){
                System.out.print(e.toString());
            }

            try{
                getExceptionC();
            }catch(ExceptionA e){
                System.out.print(e.toString());
            }

    }

        public static void  getExceptionB() throws ExceptionB{
            throw new ExceptionB("First Exception subclass caught.\n");
        }

        public static void  getExceptionC() throws ExceptionC{
            throw new ExceptionC("Second Exception subclass caught.");
        }

}

class ExceptionA extends Exception {

    public ExceptionA(String message){
        super(message);
    }
}

class ExceptionB extends ExceptionA {

    public ExceptionB(String message){
        super(message);
    }
}

class ExceptionC extends ExceptionB {

    public ExceptionC(String message){
        super(message);
    }
}