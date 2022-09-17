/*
This Java file contains further practise of basic Object oriented 
programming principles. 

These next programs will contain more complex approaches to 
creating classes with their capabiliteis. 

This file, continues on from the organizations. But a method will be 
created to calculate income taxes from what an organization has to pay. \

 */
package TaxOrganization;
        
import static java.lang.System.out;

        
public class Organization {
    
    public String nameOfCompany; 
    public double revenue; 
    public boolean payTax;
    // three basic fields created for organization class
    
    public void displayCompany(){
        out.print(nameOfCompany);
        System.out.println("");
        out.print(revenue); 
        System.out.println("");
        out.print(payTax); 
    }
    // method to display info about this company 
    
    public double getTaxAmount (double taxAmount){
        return revenue * taxAmount/100; 
    }
    
    /*
    Above I have created a more complex method. 
    
    This one contains a PARAMETER. 
    
    This kind of method is called a getMethod, which will need a 
    data type before naming it as it will be actually returning 
    a value. 
    
    Within the brackets is the parameter it self which contains a 
    data type and the local vairable for the method. 
    
    inside the body, the 
    */
        
}
