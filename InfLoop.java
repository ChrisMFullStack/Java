// Exercise 4.34
// Checkerboard Pattern of Asterisks

public class InfLoop{
	public static void main(String[] args){

            int num = 1;

            if((num * 2) != 0) {
                  num *= 2;
            }
              
            while(true) {
                  System.out.println(num);
                  num = num * 2;
            }
	}// terminal prints zeros until it runs out of memory
}