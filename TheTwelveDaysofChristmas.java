// Exercise 5.29
// The Twelve Days of Christmas

public class TheTwelveDaysofChristmas{
    public static void main(String[] args) {

        // String array for the days of Christmas, 0 left blank        
        String[] christmasDays = {" ", "first", "second", "third", "forth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};

            // for loop to cycle through christmasDays array using int "i" to activate the switch starting at 1 skipping 0
            for (int i = 1; i < christmasDays.length; i++){

            // Prints first line of each verse using christmasDays String array and loop to input each day 
            if(i <= 12){
            System.out.println("On the " + christmasDays[i] + " day of Christmas, my true love sent to me: "); 
            }            
            
            // switch prints remaining verse lines activated by i as it cycles from 1 to 12 in the loop
            switch (i) {
                    case 12:
                        System.out.println("Twelve drummers drumming,");
                    case 11:
                        System.out.println("Eleven pipers piping,");
                    case 10:
                        System.out.println("Ten lords-a-leaping,");
                    case 9:
                        System.out.println("Nine ladies dancing,");
                    case 8:
                        System.out.println("Eight maids-a-milking,");
                    case 7:
                        System.out.println("Seven swans-a-swimming,");
                    case 6:
                        System.out.println("Six geese-a-laying,");
                    case 5:
                        System.out.println("Five golden rings,");
                    case 4:
                        System.out.println("Four calling birds,");
                    case 3:
                        System.out.println("Three french hens,");
                    case 2:
                        System.out.println("Two turtle doves, and");
                    case 1:
                        System.out.println("a partridge in a pear tree.\n");
                        break;
                    default:
                        break;
                }
            }

    }
    
}