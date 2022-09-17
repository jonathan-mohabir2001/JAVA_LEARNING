
package Foods;
import Foods.FoodProduct; 
import static java.lang.System.out;


public class Output {


    public static void main(String[] args) {
      
        FoodProduct item1 = new FoodProduct(); 
        // object created of FoodProduct type. 
        
        item1.foodType="Banana"; 
        item1.cost = 0.30; 
        item1.caloriesPerServing= 89; 
        item1.servings = 1; 
        item1.weightGrams = 100; 
        
        /*
        A basic item is created from the foodproduct type. 
        Values assigned using dot notation
        */
        
        item1.displayInfo();
        
        /*
        The display info method was called and has succesfully returned all 
        fields created within the object. 
        */
        
    }
    
}
