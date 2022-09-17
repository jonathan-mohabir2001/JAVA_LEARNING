/*
Continuing more java class practise 
 */
package CarProject;

import static java.lang.System.out;


public class Vehicle {
    
    public String name; 
    public int modelYear; 
    public double milesDriven; 
    
  /*
    To understand further, we have three fields 
    all are public. Easy. 
   */
    
   
    /*
    Instead of repeating the out.print method within the 
    output class, a basic method is already included into the 
    return info method here. 
    */
    public void returnInfo(){
        
        out.print( "The name of this vehicle is:"+name);
        System.out.println("");
        out.print ("The model year of this vehicle is: " + modelYear);
        System.out.println("");
        out.print( "The miles on this vehicle is: " + milesDriven);
    }
    
    
    
}
