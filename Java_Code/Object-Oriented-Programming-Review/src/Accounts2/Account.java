/*
This is another class of the account type but will incorporate 
methods which will display functionality. 

 */
package Accounts2;


public class Account {
    String name; 
    String address; 
    double balance;

    
 public void display(){
    
     System.out.println("Name is:" + name);
     System.out.println("");
     System.out.println("Address is:" + address);
     System.out.println("");
     System.out.println("Balance is:" + balance);
     
 }
 
 /*
 The account class now contains a method which can now be used within other objects
 that are created from this class. 
 */
   
}
