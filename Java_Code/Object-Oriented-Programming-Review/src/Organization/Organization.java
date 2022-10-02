/*
This file will contain practise for creating 
classes, and objects of classes again. 

 */
package Organization;

public class Organization {
/*
This class will define the fields 
name, annual revenue, and boolean indicating if they are 
a profit generating company.     
*/
    
    String name; 
    double revenue; 
    boolean profitMaking; 
    // three fields created.
    
    public void displayInformation(){
        System.out.println("Our name is: " + name);
        // printing out name
        System.out.println("");
        System.out.println("Our revenue is: " + revenue);
        // printing out the revenue
        System.out.println("");
        System.out.println("Are we here to make profit..." + profitMaking);
        // printing the boolean value along  with a statement. 
    }
    // this method is created in the main class so that it can be easily called 
    // in the class with the main method. 
    
    
}
