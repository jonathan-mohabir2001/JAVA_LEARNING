/*
This class will contain the main method in order to create 
objects of the organization class. 
*/
package Organization;


public class Output {

    public static void main(String[] args) {

        Organization company1 = new Organization();
        
        Organization company2 = new Organization();
        // two objects of the organization class have been created. 

        company1.name = "Apple corporation"; 
        company1.revenue = 20000.00; 
        company1.profitMaking = true; 
        // fields set to company 1. 
        company1.displayInformation(); 
        // Method called to display information about company 1. 
        
        company2.name = "Microsoft Corporation"; 
        company2.profitMaking = true; 
        company2.revenue = 1200000.00; 
        company2.displayInformation();
        // method called to display information about company 2. 
        
        System.out.println("End of program. ");
        
        
    }
    
}
