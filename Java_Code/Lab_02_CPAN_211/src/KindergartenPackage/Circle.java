
package KindergartenPackage;

/**
 *
 * @author Jonathan Mohabir
 */
public class Circle implements Shape {
    private double radius; 
   // radius variable will be returned to have area calculated within getArea
    private String color;
    // color variable will be returned within getColor method 

    public Circle (String color , double radius){
    this.color = color; 
    this.radius = radius;     
    }
    // initialzing variables

    public String getColor() {
       return this.color; 
    }
    // get color method, inherited from Shape 


    public double getArea() {
     // getArea method inherited from Shape 
        return this.radius * this.radius * 3.14; 
    }
   
    


    
}
