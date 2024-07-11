// Exercise 8.04
// (Rectangle Class) Create a class Rectangle with attributes length and width, each of which defaults to 1. 

public class RectangleClass{

    private double width = 1;
    private double length = 1;

    // get method for length
    public double getLength(){return length;}
    // get method for width
    public double getWidth(){return width;}

    // set method for length
    public void setLength(double length){
        if (length < 0.0 || length > 20.0){
            throw new IllegalArgumentException("Length must be larger than 0.0 and less than 20.0");
        }else{
            this.length = length;
        }
        
    }
    // set method for width
    public void setWidth(double width){
        if (width < 0.0 || width > 20.0){
            throw new IllegalArgumentException("Width must be larger than 0.0 and less than 20.0");
        }else{
            this.width = width;
        }
        
    }

    // method for calculating area
    public double area(){
        return (length * width);
    }

    // method for calculating perimeter
    public double perimeter(){
        return ((length + width) * 2);
    }
    
}