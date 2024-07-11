// Exercise 5.12
// Calculating the Product of Odd Integers

public class OddIntergers{
    public static void main(String[] args) {
        
        int odds = 1;
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        // Loop that picks out odd numbers and multiplys them together
        for (int i = 1; i <= numbers.length; i++){
            if (i % 2 != 0){
                odds *= i;
            }
        }
        // outputs product of odd numbers
        System.out.printf("Product is: %d\n\n", odds);

    }
    
}