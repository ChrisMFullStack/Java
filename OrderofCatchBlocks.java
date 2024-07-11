// Exercise 11.18
// (Order of catch Blocks) Write a program demonstrating that the order of 
// catch blocks is important.

import java.io.IOException;

public class OrderofCatchBlocks{
    public static void main(String[] args) {
        try {
            throw new IOException();
        } catch (Exception e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
