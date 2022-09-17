/*
Continuing more java class practise 
 */
package CarProject;

import static java.lang.System.out;


public class Vehicle {
    
    public String name; 
    public int modelYear; 
    public double milesDriven; 
    
   
    public void returnInfo(){
        
        out.print( "The name of this vehicle is:"+name);
        System.out.println("");
        out.print ("The model year of this vehicle is: " + modelYear);
        System.out.println("");
        out.print( "The miles on this vehicle is: " + milesDriven);
    }
    
    
    
}
