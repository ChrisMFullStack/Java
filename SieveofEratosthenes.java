// Exercise 7.27
// (Sieve of Eratosthenes) Write an application that uses an array of 
// 1,000 elements to determine and display the prime numbers between 2 and 999.

public class SieveofEratosthenes{
    public static void main(String[] args){

        // Create boolean array with a size of 1000
        boolean[] prime = new boolean[1000];
        int count = 0;

        // sets all values to true
        for (int i = 0; i < prime.length; i++){
            prime[i] = true;
        }

        // loops through values and sets them to false is they are not prime numbers
        for (int j = 2; j < prime.length; j++){
            for (int p = 2; p <= (j / 2); p++){
                if (j % p == 0){
                    prime[j] = false;
                }
            }
        }

        // outputs all values set to true which are prime numbers
        for (int index = 2; index < prime.length; index++){
            if (prime[index] == true){
                ++count;
                System.out.printf("%d is prime\n", index);
            }
        }
        // outputs the number of primes counted
        System.out.printf("\n%d primes found.", count);
    }
}