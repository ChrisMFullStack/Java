// Exercise 14.23
// (Metric Conversions) Write an application that will assist the user with metric conversions.

import java.util.Scanner;

public class MetricConversions{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("This application makes metric to imperial conversions and vice versa\n" +
        "Units in (millimeter to inches, kilometers to miles, yards to meters, grams to ounces,\nkilograms to pounds," + 
        " fluid ounces to milliliters, and gallons to litres) may be used.\n\n");
        
        System.out.print("Please enter the source unit:\n");
        String source = input.nextLine();
        System.out.print("Please enter the destination unit:\n");
        String dest = input.nextLine();
        System.out.print("Please enter the amount to convert:\n");
        double unit = input.nextDouble();

        System.out.println();

        Converter con = new Converter(source, dest, unit);

        con.convert();
    }
}

class Converter{

    final private double mm_to_in = 0.03937;
    final private double km_to_mile = 0.6214;
    final private double yard_to_meter = 0.9144;
    final private double meter_to_feet = 3.28084;
    final private double gram_to_oz = 0.0353;
    final private double kg_to_lb = 2.2046;
    final private double founce_to_ml = 29.574;
    final private double gallon_to_liter = 3.7854;
    private String source;
    private String dest;
    private double unit;


    public Converter(String source, String dest, double unit){
        this.source = source;
        this.dest = dest;
        this.unit = unit;
    }

    public void convert(){

        if (source.equals("millimeters") && dest.equals("inches")){
            double newUnit = unit * mm_to_in;
            System.out.printf("%.2f %s = %.2f %s", unit, source, newUnit, dest);
        }else if(source.equals("inches") && dest.equals("millimeters")){
            double newUnit = unit / mm_to_in;
            System.out.printf("%.2f %s = %.2f %s", unit, source, newUnit, dest);
        }else if(source.equals("kilometers") && dest.equals("miles")){
            double newUnit = unit * km_to_mile;
            System.out.printf("%.2f %s = %.2f %s", unit, source, newUnit, dest);
        }else if(source.equals("miles") && dest.equals("kilometers")){
            double newUnit = unit / km_to_mile;
            System.out.printf("%.2f %s = %.2f %s", unit, source, newUnit, dest);
        }else if(source.equals("yards") && dest.equals("meters")){
            double newUnit = unit * yard_to_meter;
            System.out.printf("%.2f %s = %.2f %s", unit, source, newUnit, dest);
        }else if(source.equals("meters") && dest.equals("yards")){
            double newUnit = unit / yard_to_meter;
            System.out.printf("%.2f %s = %.2f %s", unit, source, newUnit, dest);
        }else if(source.equals("meters") && dest.equals("feet")){
            double newUnit = unit * meter_to_feet;
            System.out.printf("%.2f %s = %.2f %s", unit, source, newUnit, dest);
        }else if(source.equals("feet") && dest.equals("meters")){
            double newUnit = unit / meter_to_feet;
            System.out.printf("%.2f %s = %.2f %s", unit, source, newUnit, dest);
        }else if(source.equals("grams") && dest.equals("ounces")){
            double newUnit = unit * gram_to_oz;
            System.out.printf("%.2f %s = %.2f %s", unit, source, newUnit, dest);
        }else if(source.equals("ounces") && dest.equals("grams")){
            double newUnit = unit / gram_to_oz;
            System.out.printf("%.2f %s = %.2f %s", unit, source, newUnit, dest);
        }else if(source.equals("kilograms") && dest.equals("pounds")){
            double newUnit = unit * kg_to_lb;
            System.out.printf("%.2f %s = %.2f %s", unit, source, newUnit, dest);
        }else if(source.equals("pounds") && dest.equals("kilograms")){
            double newUnit = unit / kg_to_lb;
            System.out.printf("%.2f %s = %.2f %s", unit, source, newUnit, dest);
        }else if(source.equals("fluid ounces") && dest.equals("milliliters")){
            double newUnit = unit * founce_to_ml;
            System.out.printf("%.2f %s = %.2f %s", unit, source, newUnit, dest);
        }else if(source.equals("milliliters") && dest.equals("fluid ounces")){
            double newUnit = unit / founce_to_ml;
            System.out.printf("%.2f %s = %.2f %s", unit, source, newUnit, dest);
        }else if(source.equals("gallons") && dest.equals("litres")){
            double newUnit = unit * gallon_to_liter;
            System.out.printf("%.2f %s = %.2f %s", unit, source, newUnit, dest);
        }else if(source.equals("litres") && dest.equals("gallons")){
            double newUnit = unit / gallon_to_liter;
            System.out.printf("%.2f %s = %.2f %s", unit, source, newUnit, dest);
        }else{
            System.out.print("Invalid selection");
        }
    }
}