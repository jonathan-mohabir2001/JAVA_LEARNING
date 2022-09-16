
package Foods;

import static java.lang.System.out;

/*
This Java class will contain basic fields 
but, there will be a shortened way to have the fields outputted 
using one method to display it when creating objects. 
*/

public class FoodProduct {
    
    public String foodType; 
    public int weightGrams;
    public double cost; 
    public int servings; 
    public int caloriesPerServing; 
    
    /*
    5 fields have all been created
    */
    
    public void displayInfo(){
        
        out.print(foodType); 
        System.out.println("");
        out.print(weightGrams);
        System.out.println("");
        out.print(cost);
        System.out.println("");
        out.print(servings); 
        System.out.println("");
        out.print(caloriesPerServing); 
   
    }
    
    /*
     This class contains a method that will simply output 
    values created by the objets to save time. 
    
    Method called once in order to shorten code within class with main method. 
     
    */
    
    
}
