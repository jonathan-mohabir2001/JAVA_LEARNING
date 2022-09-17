/*
This class will contain fields about food and it's 
name, and caloric information. Weight, and a method to 
print all those properties. 


These files will demonstrate a more complex method to calculate 
cost per 100 grams. 

cost per serving 

total number of calories per serving. 

 */
package FoodCaloricIntake;

import static java.lang.System.out;

public class Food {

    public String food;
    public double weightInGrams;
    public double cost;
    public int calories;
    public int servings;
    public double caloriesPerServing;

    public void displayFood() {
        System.out.println("Food name is");
        out.print(food);
        System.out.println("");
        System.out.println("Food weight in grams is:");

        out.print(weightInGrams);
        System.out.println("");

        System.out.println("Cost is:");
        System.out.println("");

        out.print(cost);
        System.out.println("");
        System.out.println("Calories is:");
        System.out.println("");
        out.print(calories);
        System.out.println("");
        System.out.println("Servings is:");
        System.out.println("");

        out.print(servings);
        System.out.println("");
        System.out.println("Calories per servings is ");
        System.out.println("");
        out.print(caloriesPerServing);

    }

    public double getCostPerHundGrams(double costPerHund) {
        return weightInGrams * costPerHund;
    }
    // this method returns cost per hundred grams

    public double getCostPerServing(double totalServings) {
        return cost * servings;
    }

    // this method returns the cost per serving
    public double getTotalCalories(int totalCal) {
        return weightInGrams * calories;
    }
    // this method calculates the total number of calories 

}
