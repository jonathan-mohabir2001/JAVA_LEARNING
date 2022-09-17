package KindergartenPackage;

import KindergartenPackage.*;
import static java.lang.System.out;

// imported every class from package 
public class Output {

    public static void main(String[] args) {

        Shape circle = new Circle("blue", 0.5);
        Shape circle2 = new Circle("red", 0.2);

        Shape square = new Square("blue", 1.0);
        Shape sqaure2 = new Square("Green", 1.5);
        Shape circle3 = new Circle("Green", 1.0);
        Shape square3 = new Square("Green", 1.0);
        Shape square4 = new Square("Blue", 1.0);
        Shape circle4 = new Circle("Red", 0.5);
        Shape sqaure5 = new Square("Red", 0.5);
        
        /*
        Objects of the sqaure class and circle class have been created and 
        are given a color and double value. 
        */
        out.print(circle.getArea() + circle.getColor());
        System.out.println("");
        out.print(circle2.getArea() + circle2.getColor());
        System.out.println("");
        out.print(square.getArea() + square.getColor());
        System.out.println("");
        out.print(sqaure2.getArea() + sqaure2.getColor());
        System.out.println("");
        out.print(circle3.getArea() + circle3.getColor());
        System.out.println("");
        out.print(square3.getArea() + square3.getColor());
        System.out.println("");
        out.print(square4.getArea() + square4.getColor());
        System.out.println("");
        out.print(circle4.getArea() + circle4.getColor());
        System.out.println("");
        out.print(sqaure5.getArea() + sqaure5.getColor());
        /*
        Using the out.print, each object is called and then 
        the get area and get color methods are accessed using 
        dot notation. 
        
        Output results the area of the shape object and it's color. 
        */

    }

}
