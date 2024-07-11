// Exercise 8.12
// (Date and Time Class) Create class DateAndTime that combines the modified 
// Time2 class of Exercise8.7 and the modified Date class of Exercise8.8 

import java.sql.Time;
import java.util.Scanner;

public class DateAndTimeTest{
    public static void main(String[] args) {
        DateAndTime dt = new DateAndTime(1, 1, 1911, 0, 0, 0);

        Scanner input = new Scanner(System.in);
        int hour;
        int minute;
        int second;
        int day;
        int month;
        int year;
        int choice = 0;

        System.out.print("Enter the date and time\nMonth: ");
        month = input.nextInt();
        dt.setMonth(month);
        System.out.print("Day: ");
        day = input.nextInt();
        dt.setDay(day);
        System.out.print("Year: ");
        year = input.nextInt();
        dt.setYear(year);
        System.out.print("Hours: ");
        hour = input.nextInt();
        dt.setHour(hour);
        System.out.print("Minutes: ");
        minute = input.nextInt();
        dt.setMinute(minute);
        System.out.print("Seconds: ");
        second = input.nextInt();
        dt.setSecond(second);        

        displayTime(dt);    

        while (choice !=7){
            System.out.print("1. Add 1 second\n2. Add 1 miniute\n3. Add 1 hours\n4. Add Day\n5. Add Month\n6. Add Year\n7. Exit\nChoice: ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    dt.tick(second);
                    displayTime(dt);
                    break;
                case 2:
                    dt.incrementMinute(minute);
                    displayTime(dt);
                    break;                    
                case 3:
                    dt.incrementHour(hour);
                    displayTime(dt);
                    break;
                case 4:
                    dt.nextDay();
                    displayTime(dt);
                    break;
                case 5:
                    dt.incrementMonth();
                    displayTime(dt);
                    break;
                case 6:
                    dt.incrementYear();
                    displayTime(dt);
                    break;
                default:
                    break;
            }
        }

    }
    // displays a Time2 object in 24-hour and 12-hour formats
    private static void displayTime(DateAndTime dt) {
        System.out.printf("Universal date and time: %s  %s\n", dt.toDateString(), dt.toUniversalTimeString());
        System.out.printf("Standard date and time: %s  %s\n\n", dt.toDateString(), dt.toStandardTimeString());
    }
}
// Exercise 8.12
// (Date and Time Class) Create class DateAndTime that combines the modified 
// Time2 class of Exercise8.7 and the modified Date class of Exercise8.8 

class DateAndTime{
    
    private int totalSeconds; //0-86400 seconds
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year

    private static final int[] daysPerMonth =
        {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // constructor: confirm proper value for month and day given the year
    public DateAndTime(int month, int day, int year, int hour, int minute, int second) {
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

        setMonth(month);
        setDay(day);
        setYear(year);
                
        // new Time2(12, 25, 42)
        if (hour < 0 || hour >= 24){
            throw new IllegalArgumentException("hour must be 0-23");    
        }
        if (minute < 0 || minute >= 60){
            throw new IllegalArgumentException("minute must be 0-59");
        }
        if (second < 0 || second >= 60){
            throw new IllegalArgumentException("second must be 0-59");
        }        
        setHour(hour);
        setMinute(minute);
        setSecond(second);
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

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public int getYear(){
        return year;
    }   

    // method adds 1 day
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
    }

    // method adds 1 month
    public void incrementMonth(){
        ++month;
        if (month > 12){
            month = 1;
            ++year;
        }  
    }

    // method adds 1 year
    public void incrementYear(){
        ++year;
    }

    // set hour 
    public void setHour(int hour){ 
        if (hour < 0 || hour >= 24){
            throw new IllegalArgumentException("hour must be 0-23");
        }        
        totalSeconds += totalSeconds + (hour * 60 * 60);
    } 

    // set minute 
    public void setMinute(int minute){ 
        if (minute < 0 || minute >= 60){
            throw new IllegalArgumentException("minute must be 0-59");
        }        
        totalSeconds += (minute * 60);
    } 

    // set second 
    public void setSecond(int second){ 
        if (second < 0 || second >= 60){
            throw new IllegalArgumentException("second must be 0-59");
        }   
            totalSeconds += second;  
    } 

    // Get Methods
    // get hour value
    public int getHour(){ 
        int hour = (totalSeconds / 3600);
        return hour; 
    } 

    // get minute value
    public int getMinute(){return ((totalSeconds / 60) % 60);} 

    // get second value
    public int getSecond(){return (totalSeconds % 60);} 

    public void tick(int second){
        ++totalSeconds;   
        if (totalSeconds >= 86400){
            nextDay();
        }       
    }

    public void incrementMinute(int minute){
            totalSeconds += 60;
            if (totalSeconds >= 86400){
                nextDay();
                totalSeconds -= 86400;
            }
        
    }
    public void incrementHour(int hour){
        totalSeconds += 3600;
        if (totalSeconds >= 86400){
            nextDay();
            totalSeconds -= 86400;
        }
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalTimeString(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    } 
    
    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toStandardTimeString(){
        return String.format("%d:%02d:%02d %s", 
            ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
            getMinute(), getSecond(), (getHour() < 12 || getHour() == 24 ? "AM" : "PM"));
    } 

        // return a String of the form month/day/year
    public String toDateString() {
        return String.format("%d/%d/%d", getMonth(), getDay(), getYear());
    }
}