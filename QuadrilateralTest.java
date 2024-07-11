// Exercise 9.8
// (Quadrilateral Inheritance Hierarchy) Write an inheritance hierarchy for classes Quadrilateral, 
// Trapezoid, Parallelogram, Rectangle and Square.

public class QuadrilateralTest{
    public static void main(String[] args) {

        Quadrilateral q = new Quadrilateral(1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4);
        Trapezoid t = new Trapezoid(0, 0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0);
        Parallelogram p = new Parallelogram(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0);
        Rectangle r = new Rectangle(17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0);
        Square s = new Square(4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0);
        

       System.out.printf("%s\n",q.toString());
       System.out.printf("%s\n\n",t.toString());
       System.out.printf("%s\n\n",p.toString());
       System.out.printf("%s\n\n",r.toString());
       System.out.printf(s.toString());
        
    }
}

class Point{
    private double xCoord1, xCoord2, xCoord3, xCoord4, yCoord1, yCoord2, yCoord3, yCoord4;
    
    
    public Point(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        this.xCoord1 = x1;
        this.xCoord2 = x2;
        this.xCoord3 = x3;
        this.xCoord4 = x4;
        this.yCoord1 = y1;
        this.yCoord2 = y2;
        this.yCoord3 = y3;
        this.yCoord4 = y4;
    }

    public double getX1(){return xCoord1;}
    public double getX2(){return xCoord2;}
    public double getX3(){return xCoord3;}
    public double getX4(){return xCoord4;}
    public double getY1(){return yCoord1;}
    public double getY2(){return yCoord2;}
    public double getY3(){return yCoord3;}
    public double getY4(){return yCoord4;}


    public String ptoString(){
        return "(" + xCoord1 + ", " + yCoord1 + ")" + ", " + "(" + xCoord2 + ", " + yCoord2 + ")" + ", " + "(" + xCoord3 + ", " + yCoord3 + ")" + ", " + "(" + xCoord4 + ", " + yCoord4 + ")";
    }

}

class Quadrilateral extends Point{

    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);        
    }

    public String toString(){

        return String.format("Coordinates of Quadrilateral are: \n%s\n", ptoString());
    }
}

class Trapezoid extends Quadrilateral{

    private double base1;
    private double base2;
    private double height;
    
    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);


        double maxY = Math.max(y1, y2);
        maxY = Math.max(maxY, y3);
        maxY = Math.max(maxY, y4);
        double minY = Math.min(y1, y2);
        minY = Math.min(minY, y3);
        minY = Math.min(minY, y4);

        double maxX1 = Math.max(x1, x2);
        double maxX2 = Math.max(x3, x4);
        double minX1 = Math.min(x1, x2);
        double minX2 = Math.min(x3, x4);

        height = Math.abs(maxY - minY);
        base1 = maxX1 - minX1;
        base2 = maxX2 - minX2;        
    }

    public double area(){
        return Math.abs(0.5 * (base1 + base2) * height);
    }
    @Override
    public String toString(){
        return "Coordinates of Trapezoid are: \n" + ptoString() + "\nHeight is: " + height + "\nArea is: " + area();
    }
}

class Parallelogram extends Trapezoid{

    private double width;
    private double height;


    public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);

        double maxY = Math.max(y1, y2);
        maxY = Math.max(maxY, y3);
        maxY = Math.max(maxY, y4);
        double minY = Math.min(y1, y2);
        minY = Math.min(minY, y3);
        minY = Math.min(minY, y4);

        height = Math.abs(maxY - minY);

        double maxX1 = Math.max(x1, x2);
        double maxX2 = Math.max(x3, x4);
        double minX1 = Math.min(x1, x2);
        double minX2 = Math.min(x3, x4);
        double maxX = Math.min(maxX1, maxX2);
        double minX = Math.min(minX1, minX2);   

        width = Math.abs(maxX - minX);
       
    }

    public double area(){
        return Math.abs(height * width);
    }

    @Override
    public String toString(){
        return "Coordinates of Parallelogram are: \n" + ptoString() + "\nHeight is: " + height + "\nWidth is: " + width + "\nArea is: " + area();
    }

}

class Rectangle extends Parallelogram{

    private double width;
    private double height;

    public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);

        double maxY = Math.max(y1, y2);
        maxY = Math.max(maxY, y3);
        maxY = Math.max(maxY, y4);
        double minY = Math.min(y1, y2);
        minY = Math.min(minY, y3);
        minY = Math.min(minY, y4);

        height = Math.abs(maxY - minY);

        double maxX1 = Math.max(x1, x2);
        double maxX2 = Math.max(x3, x4);
        double minX1 = Math.min(x1, x2);
        double minX2 = Math.min(x3, x4);
        double maxX = Math.min(maxX1, maxX2);
        double minX = Math.min(minX1, minX2);   

        width = Math.abs(maxX - minX);
       
    }

    public double area(){
        return Math.abs(height * width);
    }

    @Override
    public String toString(){
        return "Coordinates of Rectangle are: \n" + ptoString() + "\nHeight is: " + height + "\nWidth is: " + width + "\nArea is: " + area();
    }

}

class Square extends Rectangle{

    private double width;
    private double height;


    public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);

        double maxY = Math.max(y1, y2);
        maxY = Math.max(maxY, y3);
        maxY = Math.max(maxY, y4);
        double minY = Math.min(y1, y2);
        minY = Math.min(minY, y3);
        minY = Math.min(minY, y4);

        height = Math.abs(maxY - minY);

        double maxX1 = Math.max(x1, x2);
        double maxX2 = Math.max(x3, x4);
        double minX1 = Math.min(x1, x2);
        double minX2 = Math.min(x3, x4);
        double maxX = Math.min(maxX1, maxX2);
        double minX = Math.min(minX1, minX2);   

        width = Math.abs(maxX - minX);
       
    }

    public double area(){
        return Math.abs(height * width);
    }

    @Override
    public String toString(){
        return "Coordinates of Square are: \n" + ptoString() + "\nSide is: " + height +  "\nArea is: " + area();
    }

}