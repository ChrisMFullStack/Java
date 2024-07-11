// Exercise 8.08
// (Enhancing Class Date) Write a program that tests method nextDay in a loop that 
// prints the date during each iteration to illustrate that the method works correctly. 

public class DateEnhancedTest{
    public static void main(String[] args) {
    
        System.out.println("Checking increment");
        DateEnhanced startDate = new DateEnhanced(11, 27, 1988);

        // loop that prints the date during each iteration
        for (int i = 0; i < 40; i++){
            startDate.nextDay();
        }

    }    
}
// Exercise 8.08
// (Enhancing Class Date) Write a program that tests method nextDay in a loop that 
// prints the date during each iteration to illustrate that the method works correctly. 

class DateEnhanced{
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year

    private static final int[] daysPerMonth =
        {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // constructor: confirm proper value for month and day given the year
    public DateEnhanced(int month, int day, int year) {
        // check if month in range
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException(
            "month (" + month + ") must be 1-12");
        }

        // check if day in range for month
        if (day <= 0 ||
            (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");
            }

        // check for leap year if month is 2 and day is 29
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);
    }
    //  method nextDay to increment the day by one
    public void nextDay(){
        ++day;
        // method increments each month if day goes over
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31){
            ++month;
            day = 1;
        }
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30){
            ++month;
            day = 1;
        }
        if ((month == 2) && (year % 4 == 0 || year % 100 == 0 || year % 400 == 0)){
            if (day > 29){
                ++month;
                day = 1;
            }
        }else if(month == 2 && day > 28){
            ++month;
            day = 1;
        }
        // increments year after going over 12 months
        if (month > 12){
            ++year;
            day = 1;
            month = 1;
        }


        System.out.println("Incremented Date:  " + this);
    
    } 

    // return a String of the form month/day/year
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}