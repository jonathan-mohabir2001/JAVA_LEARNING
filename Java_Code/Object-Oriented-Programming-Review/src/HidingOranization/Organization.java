/*
This Java class will incorporate the teachings of Data hiding. 

This is the process of ensuring that our fields cannot be accessed by outside 
code. 

This helps prevent mistakes being made. 

The organization class will be created again below but incorporate 
data hiding (encapsulation). 

In order to access the fields when creating objects, set methods and get methods
will be created and used. 
 */
package HidingOranization;

public class Organization {

    private String name;
    private double balance;
    private boolean profitMaking;
    // fields are assigned with private access. 

    public void setName(String n) {
        name = n;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public void setProfitMaking(boolean pf) {
        profitMaking = pf;
    }
    // set methods created and will be used to set values of the fields in the main class 

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public boolean getProfitMaking() {
        return profitMaking;
    }
    // get methods created in order to return each field when organizations are created in the main    

    public void returnInformation() {
        System.out.println("Name is:" + getName());
        System.out.println("");
        System.out.println("Balance is: " + getBalance());
        System.out.println("");
        System.out.println("The profit status is:" + getProfitMaking());
    }
    // a method is created in order to call all methods at once to return all info. 

}
