//Exercise 3.14
//DateTest Class

public class DateTest {
    public static void main(String[] arg){

        int month;
        int day;
        int year;

        Date date = new Date();

        month = 7;
        day = 4;
        year = 2004;

        date.setMonth(month);
        date.setDay(day);
        date.setYear(year);
        date.displayDate();

        System.out.printf("The initial date is: %s%n", date.displayDate());

        date.setMonth(11);
        date.setDay(1);
        date.setYear(2003);

        System.out.printf("Date with new values is: %s%n", date.displayDate());


    }
    
}
