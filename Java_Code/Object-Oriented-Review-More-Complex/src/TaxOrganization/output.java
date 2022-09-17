/*
This java file will contain objects of the organization class 
 */
package TaxOrganization;
import TaxOrganization.Organization;
import static java.lang.System.out;

public class output {

   
    public static void main(String[] args) {
        
        Organization company1 = new Organization(); 
        Organization company2 = new Organization(); 
        
        company1.nameOfCompany = "Apple Organization";
        company1.revenue = 2000000.00; 
        
        double taxAmountApple = company1.getTaxAmount(30); 
        /* The line above creates a data type for the amount of taxes apple must
           pay. 
            
           Company 1 is called and then dot notation accesses the getTaxAmount 
           method and passes the parameter value. 
           
           This line of code sets the amount they have to pay to taxAmountApple
        
        */
        company1.payTax = true; 
        
        System.out.println("Below is the first company");
        System.out.println("");
        company1.displayCompany();
        System.out.println("They pay this amount in tax below");
        System.out.println("");
        
        company1.getTaxAmount(taxAmountApple);
        // getTax amount is again called but then passed the taxAmountApple 
        // variable 
        out.print(taxAmountApple); 
        // the tax amount is then printed out to the console. 
        
        // end of program for apple 
        
        company2.nameOfCompany = "Microsoft Company"; 
        company2.payTax = true; 
        company2.revenue = 9000000; 
        
        double microsoftTaxAmount = company2.getTaxAmount(50); 
        
        System.out.println("Below is the microsoft corporation info");
        System.out.println("");
        company2.displayCompany();
        System.out.println("");
        System.out.println("They pay this much in taxes:");
        System.out.println("");
        out.print(company2.getTaxAmount(microsoftTaxAmount));
        
        // end of program for microsoft. 
        
        
        
        
    }
    
}
