package Accounts;
import static java.lang.System.out; 
import Accounts.Account; 


public class UseAccount {


    public static void main(String[] args) {
        // TODO code application logic here
        Account myAccount; 
        Account yourAccount; 
        
        myAccount = new Account(); 
        yourAccount = new Account(); 
    
    /*
    First lines  create two  new objects of the Account type class. 
    */
    myAccount.name= "Jonathan Mohabir"; 
    /*
     /* at first I put 'jonathan mohabir', Java does not like that. 
     it was giving me an error complanining about the character string being 
     an unclosed literal. A reminder to use full quatation marks. 
    */
    myAccount.address = "Toronto, Ontario Canada"; 
    myAccount.balance = 50.75; 
    
    yourAccount.name = "Second Jonathan"; 
    yourAccount.address = "Thornton Ontario, Canada"; 
    yourAccount.balance = 61.40; 
    
    /*
    The next lines are using dot notation to assign variable values to the 
    fields from the original Account class. Because we're in the same 
    package, Java knows what those fields are from Account. 
    */
    
        System.out.println("My name is: " + myAccount.name);
        System.out.println("");
        System.out.println("My Address is:" + myAccount.address);
        System.out.println("");
        System.out.println("My pay per hour will be:" + myAccount.balance);
        System.out.println("This is the end of first Jonathan");
        System.out.println("");
        System.out.println("Second me is: " + yourAccount.name);
        System.out.println("");
        System.out.println("Second address is:" + yourAccount.address );
        System.out.println("");
        System.out.println("Second pay per hour is: " + yourAccount.balance);
    }
    
}
