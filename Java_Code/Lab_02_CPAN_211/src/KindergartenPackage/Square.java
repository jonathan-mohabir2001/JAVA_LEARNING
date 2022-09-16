/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KindergartenPackage;

/**
 *
 * @author Jonathan Mohabir
 */
public class Square implements Shape {
    
    private double length; 
    // length variable for calculating area of square 
    private String color; 
    // colour variable for finding color of square. 
    
    public Square (String color, double length){
        this.length= length; 
        this.color = color; 
    }
        
   
    public double getArea() {
        return this.length * this.length; 
    }

    public String getColor() {
        return this.color; 
    }
    
}
