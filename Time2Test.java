// Exercise 8.05
// (Modifying the Internal Data Representation of a Class) Modify the 
// Time2 class of Fig.8.5 to implement the time as the number of seconds 
// since midnight and show that no change is visible to the clients of the class.

public class Time2Test {
    public static void main(String[] args) {
        Time2 t1 = new Time2(); // 00:00:00
        Time2 t2 = new Time2(2); // 02:00:00
        Time2 t3 = new Time2(21, 34); // 21:34:00
        Time2 t4 = new Time2(12, 25, 42); // 12:25:42
        Time2 t5 = new Time2(t4); // 12:25:42

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour, minute and second specified", t4);
        displayTime("t5: Time2 object t4 specified", t5);

        // attempt to initialize t6 with invalid values
        try {
            Time2 t6 = new Time2(27, 74, 99); // invalid values
        }
        catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing t6: %s%n",
                e.getMessage());
            }
    }
   
    // displays a Time2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n %s%n %s%n",
        header, t.toUniversalString(), t.toString());
    }
}

// Exercise 8.05
// (Modifying the Internal Data Representation of a Class) Modify the 
// Time2 class of Fig.8.5 to implement the time as the number of seconds 
// since midnight and show that no change is visible to the clients of the class.

class Time2{

    private int totalSeconds; //0-86400 seconds

    // Time2 no-argument constructor: 
    // initializes each instance variable to zero
    public Time2(){
        this(0); // invoke constructor with three arguments
    } 

    // Time2 constructor: hour supplied, minute and second defaulted to 0
    public Time2(int hour){         
        this(hour, 0, 0); // invoke constructor with three arguments
        hour = totalSeconds / 60 / 60;
    } 

    // Time2 constructor: hour and minute supplied, second defaulted to 0
    public Time2(int hour, int minute){        
        this(hour, minute, 0); // invoke constructor with three arguments
        minute = (hour - 12) /60;
    } 

    // Time2 constructor: hour, minute and second supplied
    public Time2(int hour, int minute, int second){ 
        
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

    // Time2 constructor: another Time2 object supplied
    public Time2(Time2 time){
        // invoke constructor with three arguments
        this(time.getHour(), time.getMinute(), time.getSecond());
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

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    } 
    
    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s", 
            ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
            getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    } 
}