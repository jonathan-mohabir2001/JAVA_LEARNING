/*
Objects will be created of the organization class. 

Set methods will be called and the get methods will be created. 
 */
package HidingOranization;

public class outputOrganization {

    public static void main(String[] args) {

        Organization company1 = new Organization();

        Organization company2 = new Organization();
        // two objects of organization created. 

        company1.setName("Apple Corp");
        // set method called to assign name 
        company1.setBalance(230000.00);
        // set method called to assign balance
        company1.setProfitMaking(true);
        // set method called to assign boolean value of profit making

        System.out.println("Company 1 information below...");
        System.out.println("");
        company1.returnInformation();

        company2.setName("IBM corporation");
        // set method called for name on company 2 
        company2.setBalance(340000.00);
        // set method called for balance on company 2 
        company2.setProfitMaking(true);
        // set method called for assigning boolean value on company 2; 
        System.out.println("Company 2 information printed below...");
        System.out.println("");
        company2.returnInformation();
        System.out.println("");
        System.out.println("End of program");

    }

}
