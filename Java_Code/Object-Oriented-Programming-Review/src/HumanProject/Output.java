package HumanProject;

import HumanProject.Person; // import statement created as we are working within classes 
import static java.lang.System.out;

public class Output {

    public static void main(String[] args) {

        Person mySelf = new Person();
        // creatig first object of type person class 
        Person secondSelf = new Person();
        // creating second object of type persom class

        mySelf.name = "Jonathan M";
        // assining name value using dot notation 
        mySelf.birthYear = 2001;
        // assinging birthyear int value using dot notation
        mySelf.age = 20;
        // assigning age int using dot notation 

        mySelf.sayHello();
        // the say hello method is called and will be outputted at this line first when the program executes  
        System.out.println("Description of myself: " + '\n'
                + mySelf.name + mySelf.age + mySelf.birthYear);
        // caputring the object values of the object mySelf. 

     
            
    }

}
