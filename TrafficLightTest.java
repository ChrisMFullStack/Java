// Exercise 8.10
// Write an enum type TrafficLight, whose constants (RED, GREEN, YELLOW) 
// take one parameter—the duration of the light. Write a program to test 
// the TrafficLight enum so that it displays the enum constants and their durations.

public class TrafficLightTest{    
    public static void main(String[] args) {

        System.out.print("Light\tDuration\n\n");

        for (TrafficLight lights : TrafficLight.values()){
            System.out.printf("%s\t%d\n", lights, lights.getTime());
        }        
    }
}

// Exercise 8.10
// Write an enum type TrafficLight, whose constants (RED, GREEN, YELLOW) 
// take one parameter—the duration of the light. Write a program to test 
// the TrafficLight enum so that it displays the enum constants and their durations.

enum TrafficLight {
    RED(50), GREEN(40), YELLOW(5);

    private int time;

    TrafficLight(int time){
        this.time = time;
    }

    public int getTime(){
        return time;
    }

}

