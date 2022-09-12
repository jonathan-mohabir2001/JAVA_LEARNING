
package Accounts2;


public class TestClass {

    public static void main(String[] args) {
     
    // creation of two objects below from Account class
    
    Account myOwnAccount; 
    Account secondaryAccount;
    
    myOwnAccount = new Account (); 
    secondaryAccount = new Account(); 
    
    myOwnAccount.name= "Jonathan M"; 
    myOwnAccount.address = "Thornton, Ontario"; 
    myOwnAccount.balance = 70000.00; 
    
    secondaryAccount.name= "Other person"; 
    secondaryAccount.balance = 10000; 
    secondaryAccount.address = "Someplace"; 
    
        System.out.println("Below the method will be called");
        
        myOwnAccount.display();
        System.out.println("above is my own account!");
        
        secondaryAccount.display();
    
    
    
    
        
        
    }
    
}
