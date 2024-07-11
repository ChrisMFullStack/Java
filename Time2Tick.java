// Exercise 8.07
// (Enhancing Class Time2) Modify class Time2 of Fig.8.5 to include a tick method 
// that increments the time stored in a Time2 object by one second.

public class Time2Tick{

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

    public void tick(int second){
        ++totalSeconds;          
    }

    public void incrementMinute(int minute){
        totalSeconds += 60;
    }
    public void incrementHour(int hour){
        totalSeconds += 3600;
        if (totalSeconds >= 86400){
            totalSeconds -= 86400;
        }
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    } 
    
    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s", 
            ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
            getMinute(), getSecond(), (getHour() < 12 || getHour() == 24 ? "AM" : "PM"));
    } 
}