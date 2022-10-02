/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package College;
import College.Person; 


/**
 *
 * @author Jonathan Mohabir
 */
public class Professor extends Person {
    private String department; 
    
    public Professor (String firstName, String lastName, String department){
        super(firstName,lastName);
        this.department = department; 
    }

    
}

