// Exercise 4.22
// Tabular Output

public class TabularOutput{

    public static void main(String[] args){

        // Variables for table
        int[] ones = {1, 2, 3, 4, 5};
        int[] tens = {10, 100, 1000};
        String col1 = "N";
        String col2 = "10*N";
        String col3 = "100*N";
        String col4 = "1000*N";

        // formats for column spacing
        String format = "%-8s%-10s%-10s%s%n";
        String format2 = "%-8d%-10d%-10d%d%n";

        // print out for table header
        System.out.printf(format, col1, col2, col3, col4);

        // loop to print table
        for (int x = 0; x < ones.length; x++){
                System.out.printf(format2, ones[x], (ones[x] * tens[0]), (ones[x] * tens[1]), (ones[x] * tens[2]));            
        }
    }
}