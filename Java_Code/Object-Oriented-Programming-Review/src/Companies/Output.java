
package Companies;
import static java.lang.System.out;
import Companies.Organization; 

public class Output {


    public static void main(String[] args) {
        Organization company01; 
        Organization company02; 
        
        company01 = new Organization(); 
        company02 = new Organization(); 
    
        /*
        Two object names declared, and then created as new 
        organization objects 
        */
        
        company01.name="Microsoft Corporation"; 
        company01.annualRevenue= 19800000.00; 
        company01.profitOrganization= true; 
        System.out.println("Below is company 01");
        
        out.print(company01.name);
        System.out.println("");
        out.print(company01.annualRevenue);
        System.out.println("");
        out.print(company01.profitOrganization); 
        System.out.println("");
        
        
        company02.name="Apple corporation";
        company02.annualRevenue = 5000000.00;
        company02.profitOrganization= true; 
        
        System.out.println("Company 2 below");
        System.out.println("");
        out.print(company02.name);
        System.out.println("");
        out.print(company02.annualRevenue); 
        System.out.println("");
        out.print(company02.profitOrganization); 
        
        
    }
    
}
