// Exercise 8.17
// (HugeInteger Class) Create a class HugeInteger which uses a 40-element array 
// of digits to store integers as large as 40 digits each. 

import java.math.BigInteger;

public class HugeInteger{
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