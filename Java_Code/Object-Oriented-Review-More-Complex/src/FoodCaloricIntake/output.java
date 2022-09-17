/*

public String food; 
    public double weightInGrams; 
    public double cost; 
    public int calories; 
    public int servings; 
    public double caloriesPerServing; 
 */
package FoodCaloricIntake;

import static java.lang.System.out;

public class output {

    public static void main(String[] args) {

        Food item1 = new Food();

        item1.food = "Banana";
        item1.cost = 0.62;
        item1.servings = 2;
        item1.calories = 89;
        item1.weightInGrams = 120.00;
        item1.caloriesPerServing = 89;

        item1.displayFood();
        System.out.println("");
        System.out.println("The cost per serving is determined below:");
        System.out.println("");

        out.print(item1.getCostPerServing(3));
        System.out.println("");

    }

}
