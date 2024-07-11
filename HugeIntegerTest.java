// Exercise 8.17
// (HugeInteger Class) Create a class HugeInteger which uses a 40-element array 
// of digits to store integers as large as 40 digits each. 
import java.math.BigInteger;
import java.util.Scanner;

public class HugeIntegerTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HugeInteger huge = new HugeInteger(null, null);

        BigInteger num1;
        BigInteger num2;

        System.out.print("Enter first HugeInteger: ");
        num1 = input.nextBigInteger();
        huge.setHuge1(num1);
        System.out.print("Enter second HugeInteger: ");
        num2 = input.nextBigInteger();
        huge.setHuge2(num2);

        System.out.printf("HugeInteger 1: %s\n", huge.getHuge1());
        System.out.printf("HugeInteger 2: %s\n", huge.getHuge2());
        huge.add();
        huge.subtract();
        System.out.printf("HugeInteger 1 is zero: %b\n", huge.isZero(huge.getHuge1()));

        System.out.printf("HugeInteger 2 is zero: %b\n", huge.isZero(huge.getHuge2()));

        System.out.printf("HugeInteger 1 is equal to HugeInteger 2: %b\n", huge.isEqualTo(huge.getHuge1(), huge.getHuge2()));

        System.out.printf("HugeInteger 1 is not equal to HugeInteger 2: %b\n", huge.isNotEqualTo(huge.getHuge1(), huge.getHuge2()));

        System.out.printf("HugeInteger 1 is greater than HugeInteger 2: %b\n", huge.isGreaterThan(huge.getHuge1(), huge.getHuge2()));

        System.out.printf("HugeInteger 1 is less than HugeInteger 2: %b\n", huge.isLessThan(huge.getHuge1(), huge.getHuge2()));

        System.out.printf("HugeInteger 1 is greater than or equal to HugeInteger 2: %b\n", huge.isGreaterThanOrEqualTo(huge.getHuge1(), huge.getHuge2()));

        System.out.printf("HugeInteger 1 is less than or equal to HugeInteger 2: %b\n", huge.isLessThanOrEqualTo(huge.getHuge1(), huge.getHuge2()));

     
    }
    
}

// Exercise 8.17
// (HugeInteger Class) Create a class HugeInteger which uses a 40-element array 
// of digits to store integers as large as 40 digits each. 



class HugeInteger{
    private BigInteger huge1;
    private BigInteger huge2;

    public HugeInteger(BigInteger huge1, BigInteger huge2){
        this.huge1 = huge1;
        this.huge2 = huge2;
    }

    public void setHuge1(BigInteger huge1){this.huge1 = huge1;}
    public void setHuge2(BigInteger huge2){this.huge2 = huge2;}
    public BigInteger getHuge1(){return huge1;}
    public BigInteger getHuge2(){return huge2;}

    public void add(){
        BigInteger sum = huge1.add(huge2);
        System.out.printf("Add result: %s\n", sum);
    }

    public void subtract(){
        BigInteger sub = huge1.subtract(huge2);
        System.out.printf("Subtract result: %s\n", sub);
    }

    public boolean isZero(BigInteger b){
        if (b.compareTo(BigInteger.ZERO)>0){
            return false;
        }else{
            return true;
        }
    }

    public boolean isEqualTo(BigInteger b1, BigInteger b2){
        if (b1.equals(b2)){
            return true;
        }else{
            return false;
        }
    }

    public boolean isNotEqualTo(BigInteger b1, BigInteger b2){
        if (b1.equals(b2)){
            return false;
        }else{
            return true;
        }
    }

    public boolean isGreaterThan(BigInteger b1, BigInteger b2){
        int compare = b1.compareTo(b2);
        if (compare == 1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isLessThan(BigInteger b1, BigInteger b2){
        int compare = b1.compareTo(b2);
        if (compare == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isGreaterThanOrEqualTo(BigInteger b1, BigInteger b2){
        int compare = b1.compareTo(b2);
        if (b1.equals(b2) || compare == 1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isLessThanOrEqualTo(BigInteger b1, BigInteger b2){
        int compare = b1.compareTo(b2);
        if (b1.equals(b2) || compare == -1){
            return true;
        }else{
            return false;
        }
    }
}