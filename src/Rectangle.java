

package Mypackage;

public class Rectangle abstract Shape {

    double length;
    double width;

    public Rectangle (double length , double width){
        this.length = length;
        this.width = width;
    }


    public double calculate_perimeter() {
        return 2 * (length + width);
    }


    public double calculate_area() {
        return width * length ;
    }
}
