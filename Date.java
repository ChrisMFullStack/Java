// Exercise 8.15
// Write a program to test class IntegerSet. Instantiate several IntegerSet objects. Test that all your methods work properly.

import java.util.Scanner;

public class Date{

    public static void main(String[] args) {

        Date date = new Date(0, 0, 0);
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int month;
        int day;
        int year;

        // prompts user to select what date format they want
        while (choice != 4){
            System.out.println("Enter 1 for format: MM/DD/YYYY");
            System.out.println("Enter 2 for format: Month DD, YYYY");
            System.out.println("Enter 3 for format: DDD YYYY");
            System.out.println("Enter 4 to exit");
            System.out.print("Choice: ");
            choice = input.nextInt();

            // switch prompts users to input dates and uses the chosen function
            switch (choice){
                case 1:
                    System.out.print("Enter Month (1-12): ");
                    month = input.nextInt();
                    date.setMonth(month);
                    System.out.print("Enter Day of Month: ");
                    day = input.nextInt();
                    date.setDay(day);
                    System.out.print("Enter Year: ");
                    year = input.nextInt();
                    date.setYear(year);
                    date.mmddyyyy();
                    break;
                case 2:
                    System.out.print("Enter Month (1-12): ");
                    month = input.nextInt();
                    date.setMonth(month);
                    System.out.print("Enter Day of Month: ");
                    day = input.nextInt();
                    date.setDay(day);
                    System.out.print("Enter Year: ");
                    year = input.nextInt();
                    date.setYear(year);
                    date.monthDDYYYY();
                    break;
                case 3:
                    System.out.print("Enter Month (1-12): ");
                    month = input.nextInt();
                    date.setMonth(month);
                    System.out.print("Enter Day of Month: ");
                    day = input.nextInt();
                    date.setDay(day);
                    System.out.print("Enter Year: ");
                    year = input.nextInt();
                    date.setYear(year); 
                    date.dddYYYY();   
                    break;
                default:
                    break;      
                }
        }        
    }
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year){
        
        setMonth(month);
        setDay(day);
        setYear(year);
        
    }

    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setYear(int year){
        this.year = year;
    }

    // function outputs date format as MM/DD/YYYY
    public void mmddyyyy(){
        System.out.printf("MM/DD/YYYY: %d/%d/%d\n\n", getMonth(), getDay(), getYear());
    }
    // function outputs date format as Month DD, YYYY
    public void monthDDYYYY(){
        String[] months = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String mon;
        mon = months[getMonth()];
        System.out.printf("Month DD, YYYY: %s %d, %d\n\n", mon, getDay(), getYear());
    }
    // function outputs date format as DDD YYYY
    public void dddYYYY(){
        int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0){
            daysPerMonth[2] = 29;

            for (int i = 0; i < getMonth(); i++){
                day += daysPerMonth[i];
            }

        }else{

            for (int i = 0; i < getMonth(); i++){
                day += daysPerMonth[i];
            }
        }

        System.out.printf("DDD YYYY: %d %d\n\n", getDay(), getYear());
    }    
}